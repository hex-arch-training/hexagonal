package com.devonfw.training.hexagonal.business.ordermanagement.core.boundary.required.repository;

import com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity.Order;
import reactor.core.publisher.Mono;

public interface SaveOrderRepositoryPort {

  Mono<Order> saveOrder(Order order);

}
