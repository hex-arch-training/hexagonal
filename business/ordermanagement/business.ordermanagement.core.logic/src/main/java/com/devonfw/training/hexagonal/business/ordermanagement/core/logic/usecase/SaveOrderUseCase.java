package com.devonfw.training.hexagonal.business.ordermanagement.core.logic.usecase;


import com.devonfw.training.hexagonal.business.ordermanagement.core.boundary.provided.usecase.SaveOrderUseCasePort;
import com.devonfw.training.hexagonal.business.ordermanagement.core.boundary.required.repository.SaveOrderRepositoryPort;
import com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class SaveOrderUseCase implements SaveOrderUseCasePort {

  private final SaveOrderRepositoryPort saveOrderRepositoryPort;

  @Override
  public Mono<Order> saveOrder(Order order) {
    return saveOrderRepositoryPort.saveOrder(order);
  }
}
