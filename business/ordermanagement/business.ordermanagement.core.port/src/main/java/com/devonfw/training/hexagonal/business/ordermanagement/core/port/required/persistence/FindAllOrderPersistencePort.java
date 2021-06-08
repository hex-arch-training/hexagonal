package com.devonfw.training.hexagonal.business.ordermanagement.core.port.required.persistence;

import com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity.Order;

import java.util.List;

public interface FindAllOrderPersistencePort {

  List<Order> findAll();

}
