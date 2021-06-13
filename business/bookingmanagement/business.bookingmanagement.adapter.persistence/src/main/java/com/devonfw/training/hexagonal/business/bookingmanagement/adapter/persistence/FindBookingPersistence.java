package com.devonfw.training.hexagonal.business.bookingmanagement.adapter.persistence;


import com.devonfw.training.hexagonal.business.bookingmanagement.adapter.persistence.mapper.BookingManagementPersistenceMapper;
import com.devonfw.training.hexagonal.business.bookingmanagement.adapter.persistence.repository.BookingJpaRepository;
import com.devonfw.training.hexagonal.business.bookingmanagement.core.domain.entity.Booking;
import com.devonfw.training.hexagonal.business.bookingmanagement.core.port.required.persistence.FindBookingPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class FindBookingPersistence implements FindBookingPersistencePort {

  private final BookingManagementPersistenceMapper mapper;

  private final BookingJpaRepository bookingJpaRepository;

  @Override
  public List<Booking> findAll() {
    return mapper.map(
        bookingJpaRepository.findAll());
  }

  @Override
  public Booking findById(Long id) {
    return mapper.map(
        bookingJpaRepository.findById(id).orElse(null));
  }
}
