package com.devonfw.training.hexagonal.business.ordermanagement.core.port.required.persistence;

import com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity.Order;

import java.util.List;

public interface FindOrderPersistencePort {

  List<Order> findAll();

  Order findById(Long id);
}
