package com.devonfw.training.hexagonal.business.ordermanagement.adapter.persistence;


import com.devonfw.training.hexagonal.business.ordermanagement.adapter.persistence.repository.OrderJpaRepository;
import com.devonfw.training.hexagonal.business.ordermanagement.core.port.required.persistence.DeleteOrderPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DeleteOrderPersistence implements DeleteOrderPersistencePort {

  private final OrderJpaRepository orderJpaRepository;

  @Override
  public void delete(Long id) {
    orderJpaRepository.deleteById(id);
  }
}
