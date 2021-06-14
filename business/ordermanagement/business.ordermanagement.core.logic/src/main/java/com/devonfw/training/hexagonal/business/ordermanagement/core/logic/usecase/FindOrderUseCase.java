package com.devonfw.training.hexagonal.business.ordermanagement.core.logic.usecase;


import com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity.Order;
import com.devonfw.training.hexagonal.business.ordermanagement.core.port.provided.usecase.FindOrderUseCasePort;
import com.devonfw.training.hexagonal.business.ordermanagement.core.port.required.persistence.FindOrderPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class FindOrderUseCase implements FindOrderUseCasePort {

  private final FindOrderPersistencePort findOrderPersistencePort;

  @Override
  public Order findById(Long id) {
    return findOrderPersistencePort.findById(id);
  }

  @Override
  public List<Order> findAll() {
    return findOrderPersistencePort.findAll();
  }
}
