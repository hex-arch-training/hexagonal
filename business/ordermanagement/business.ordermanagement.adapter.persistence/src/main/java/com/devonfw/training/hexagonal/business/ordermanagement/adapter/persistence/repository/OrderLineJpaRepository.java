package com.devonfw.training.hexagonal.business.ordermanagement.adapter.persistence.repository;

import com.devonfw.training.hexagonal.business.ordermanagement.adapter.persistence.entity.OrderLineJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderLineJpaRepository extends JpaRepository<OrderLineJpaEntity, Long> {
}
