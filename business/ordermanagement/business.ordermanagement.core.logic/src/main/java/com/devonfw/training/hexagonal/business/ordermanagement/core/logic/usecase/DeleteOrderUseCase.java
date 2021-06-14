package com.devonfw.training.hexagonal.business.ordermanagement.core.logic.usecase;


import com.devonfw.training.hexagonal.business.ordermanagement.core.port.provided.usecase.DeleteOrderUseCasePort;
import com.devonfw.training.hexagonal.business.ordermanagement.core.port.required.persistence.DeleteOrderPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DeleteOrderUseCase implements DeleteOrderUseCasePort {

  private final DeleteOrderPersistencePort deleteOrderPersistencePort;

  @Override
  public void delete(Long id) {
    deleteOrderPersistencePort.delete(id);
  }
}
