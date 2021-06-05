package com.devonfw.training.hexagonal.business.ordermanagement.core.boundary.required.persistence;

import reactor.core.publisher.Mono;

public interface DeleteOrderPersistencePort {

  void delete(Long id);

}
