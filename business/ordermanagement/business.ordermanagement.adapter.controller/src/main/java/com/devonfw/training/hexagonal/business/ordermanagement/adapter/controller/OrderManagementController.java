package com.devonfw.training.hexagonal.business.ordermanagement.adapter.controller;

import com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity.Order;
import com.devonfw.training.hexagonal.business.ordermanagement.core.port.provided.usecase.DeleteOrderUseCasePort;
import com.devonfw.training.hexagonal.business.ordermanagement.core.port.provided.usecase.FindOrderUseCasePort;
import com.devonfw.training.hexagonal.business.ordermanagement.core.port.provided.usecase.SaveOrderUseCasePort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("ordermanagement")
public class OrderManagementController {

  private final SaveOrderUseCasePort saveOrderUseCasePort;
  private final FindOrderUseCasePort findOrderUseCasePort;
  private final DeleteOrderUseCasePort deleteOrderUseCasePort;

  @PostMapping(value = "/order",
      consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public Order save(@RequestBody Order order) {
    return saveOrderUseCasePort.save(order);
  }

  @GetMapping(value = "/order/{id}",
      produces = MediaType.APPLICATION_JSON_VALUE)
  public Order getById(@RequestParam Long id) {
    return findOrderUseCasePort.findById(id);
  }

  @GetMapping(value = "/order",
      produces = MediaType.APPLICATION_JSON_VALUE)
  public List<Order> getAll() {
    return findOrderUseCasePort.findAll();
  }

  @DeleteMapping(value = "/order/{id}")
  public void delete(@RequestParam Long id) {
    deleteOrderUseCasePort.delete(id);
  }
}
