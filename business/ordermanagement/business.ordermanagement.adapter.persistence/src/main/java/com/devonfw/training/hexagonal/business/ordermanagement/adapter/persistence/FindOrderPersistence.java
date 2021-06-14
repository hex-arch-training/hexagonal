package com.devonfw.training.hexagonal.business.ordermanagement.adapter.persistence;


import com.devonfw.training.hexagonal.business.ordermanagement.adapter.persistence.mapper.OrderManagementPersistenceMapper;
import com.devonfw.training.hexagonal.business.ordermanagement.adapter.persistence.repository.OrderJpaRepository;
import com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity.Order;
import com.devonfw.training.hexagonal.business.ordermanagement.core.port.required.persistence.FindOrderPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class FindOrderPersistence implements FindOrderPersistencePort {

  private final OrderManagementPersistenceMapper mapper;

  private final OrderJpaRepository orderJpaRepository;

  @Override
  public List<Order> findAll() {
    return mapper.map(orderJpaRepository.findAll());
  }

  @Override
  public Order findById(Long id) {
    return mapper.map(orderJpaRepository.findById(id).orElse(null));
  }
}
