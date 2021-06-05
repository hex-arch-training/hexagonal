package com.devonfw.training.hexagonal.business.ordermanagement.core.boundary.required.persistence;

import com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity.Order;

public interface SaveOrderPersistencePort {

  Order save(Order order);

}
