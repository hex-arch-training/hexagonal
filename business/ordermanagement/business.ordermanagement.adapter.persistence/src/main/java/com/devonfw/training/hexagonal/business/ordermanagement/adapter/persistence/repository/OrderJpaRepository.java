package com.devonfw.training.hexagonal.business.ordermanagement.adapter.persistence.repository;

import com.devonfw.training.hexagonal.business.ordermanagement.adapter.persistence.entity.OrderJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderJpaRepository extends JpaRepository<OrderJpaEntity, Long> {
}
