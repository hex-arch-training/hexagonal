package com.devonfw.training.hexagonal.business.ordermanagement.core.boundary.provided.usecase;

import com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity.Order;

public interface SaveOrderUseCasePort {

  Order saveOrder(Order order);

}
