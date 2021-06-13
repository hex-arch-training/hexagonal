package com.devonfw.training.hexagonal.business.ordermanagement.core.logic.usecase;


import com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity.Order;
import com.devonfw.training.hexagonal.business.ordermanagement.core.port.provided.usecase.SaveOrderUseCasePort;
import com.devonfw.training.hexagonal.business.ordermanagement.core.port.required.persistence.SaveOrderPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SaveOrderUseCase implements SaveOrderUseCasePort {

  private final ValidateOrderUseCase validateOrder;

  private final ConfirmOrderUseCase confirmOrderUseCase;

  private final SaveOrderPersistencePort saveOrderPersistencePort;

  @Override
  public Order saveOrder(Order order) {
    validateOrder.validateOrder(order);

    confirmOrderUseCase.confirmationOrder(order);

    return saveOrderPersistencePort.save(order);
  }

}
