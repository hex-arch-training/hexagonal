package com.devonfw.training.hexagonal.business.ordermanagement.core.port.provided.usecase;

import com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity.Order;
import com.devonfw.training.hexagonal.business.ordermanagement.core.port.provided.exception.NoBookingException;

public interface SaveOrderUseCasePort {

  Order save(Order order) throws NoBookingException;

}
