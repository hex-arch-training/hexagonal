package com.devonfw.training.hexagonal.business.ordermanagement.core.boundary.required.persistence;

import com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity.Order;
import reactor.core.publisher.Mono;

public interface SaveOrderPersistencePort {

  Mono<Order> save(Order order);

}
