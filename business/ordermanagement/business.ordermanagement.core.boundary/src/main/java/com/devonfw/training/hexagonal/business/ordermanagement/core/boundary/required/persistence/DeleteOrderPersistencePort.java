package com.devonfw.training.hexagonal.business.ordermanagement.core.boundary.required.persistence;

public interface DeleteOrderPersistencePort {

  void delete(Long id);

}
