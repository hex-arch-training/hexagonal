package com.devonfw.training.hexagonal.business.ordermanagement.adapter.repository;


import com.devonfw.training.hexagonal.business.ordermanagement.core.boundary.required.repository.SaveOrderRepositoryPort;
import com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity.Order;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Repository
public class SaveOrderRepository implements SaveOrderRepositoryPort {

  Logger logger = LoggerFactory.getLogger(SaveOrderRepository.class);

  @Override
  public Mono<Order> saveOrder(Order order) {
    logger.info("Order stored: {}", order);
    return Mono.just(order);
  }
}
