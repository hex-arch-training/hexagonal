package com.devonfw.training.hexagonal.business.ordermanagement.core.port.required.persistence;

import com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity.Order;

public interface SaveOrderPersistencePort {

  Order save(Order order);

}
