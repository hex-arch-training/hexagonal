package com.devonfw.training.hexagonal.business.bookingmanagement.adapter.persistence.repository;

import com.devonfw.training.hexagonal.business.bookingmanagement.adapter.persistence.entity.BookingJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingJpaRepository extends JpaRepository<BookingJpaEntity, Long> {
}
