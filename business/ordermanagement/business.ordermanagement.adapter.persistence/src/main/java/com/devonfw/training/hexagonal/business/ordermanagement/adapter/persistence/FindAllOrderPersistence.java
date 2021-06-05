package com.devonfw.training.hexagonal.business.ordermanagement.adapter.persistence;


import com.devonfw.training.hexagonal.business.ordermanagement.adapter.persistence.mapper.OrderManagementPersistenceMapper;
import com.devonfw.training.hexagonal.business.ordermanagement.adapter.persistence.repository.OrderJpaRepository;
import com.devonfw.training.hexagonal.business.ordermanagement.core.boundary.required.persistence.FindAllOrderPersistencePort;
import com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class FindAllOrderPersistence implements FindAllOrderPersistencePort {

  private final OrderManagementPersistenceMapper mapper;

  private final OrderJpaRepository orderJpaRepository;

  @Override
  public Flux<Order> findAll() {
    List<Order> orders = mapper.map(orderJpaRepository.findAll());
    return Flux.fromIterable(orders);
  }
}
