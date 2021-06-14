package com.devonfw.training.hexagonal.business.ordermanagement.core.port.provided.usecase;

import com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity.Order;

import java.util.List;

public interface FindOrderUseCasePort {

  Order findById(Long id);

  List<Order> findAll();
}
