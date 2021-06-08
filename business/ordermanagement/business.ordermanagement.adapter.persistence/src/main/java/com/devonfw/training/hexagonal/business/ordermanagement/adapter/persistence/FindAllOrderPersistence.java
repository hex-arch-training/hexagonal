package com.devonfw.training.hexagonal.business.ordermanagement.adapter.persistence;


import com.devonfw.training.hexagonal.business.ordermanagement.adapter.persistence.mapper.OrderManagementPersistenceMapper;
import com.devonfw.training.hexagonal.business.ordermanagement.adapter.persistence.repository.OrderJpaRepository;
import com.devonfw.training.hexagonal.business.ordermanagement.core.port.required.persistence.FindAllOrderPersistencePort;
import com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class FindAllOrderPersistence implements FindAllOrderPersistencePort {

  private final OrderManagementPersistenceMapper mapper;

  private final OrderJpaRepository orderJpaRepository;

  @Override
  public List<Order> findAll() {
    return mapper.map(orderJpaRepository.findAll());
  }
}
