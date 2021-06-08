package com.devonfw.training.hexagonal.business.ordermanagement.adapter.persistence;


import com.devonfw.training.hexagonal.business.ordermanagement.adapter.persistence.entity.OrderJpaEntity;
import com.devonfw.training.hexagonal.business.ordermanagement.adapter.persistence.mapper.OrderManagementPersistenceMapper;
import com.devonfw.training.hexagonal.business.ordermanagement.adapter.persistence.repository.OrderJpaRepository;
import com.devonfw.training.hexagonal.business.ordermanagement.core.port.required.persistence.SaveOrderPersistencePort;
import com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SaveOrderPersistence implements SaveOrderPersistencePort {

  private final OrderManagementPersistenceMapper mapper;

  private final OrderJpaRepository orderJpaRepository;

  @Override
  public Order save(Order order) {
    OrderJpaEntity savedOrder = orderJpaRepository.save(mapper.map(order));
    return mapper.map(savedOrder);
  }
}
