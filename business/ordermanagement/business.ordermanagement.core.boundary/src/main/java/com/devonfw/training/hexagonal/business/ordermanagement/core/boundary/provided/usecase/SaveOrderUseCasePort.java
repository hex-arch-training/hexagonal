package com.devonfw.training.hexagonal.business.ordermanagement.core.boundary.provided.usecase;

import com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity.Order;
import reactor.core.publisher.Mono;

public interface SaveOrderUseCasePort {

  Mono<Order> saveOrder(Order order);

}
