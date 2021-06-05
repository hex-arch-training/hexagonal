package com.devonfw.training.hexagonal.business.ordermanagement.adapter.controller;

import com.devonfw.training.hexagonal.business.ordermanagement.core.boundary.provided.usecase.SaveOrderUseCasePort;
import com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("ordermanagement")
public class OrderManagementController {

  private final SaveOrderUseCasePort saveOrderUseCasePort;

  @PostMapping(value = "/order",
      consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.TEXT_EVENT_STREAM_VALUE)
  public Mono<Order> saveOrder(@RequestBody Order order) {
    return saveOrderUseCasePort.saveOrder(order);
  }

  @GetMapping(value = "/order",
      produces = MediaType.TEXT_EVENT_STREAM_VALUE)
  public Mono<Order> getOrder() {
    return Mono.justOrEmpty(Order.withId(1L, 1L, 2L, 3L, 4L, null));
  }
}
