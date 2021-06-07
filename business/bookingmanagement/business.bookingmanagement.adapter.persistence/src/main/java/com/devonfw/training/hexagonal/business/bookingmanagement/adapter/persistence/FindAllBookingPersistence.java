package com.devonfw.training.hexagonal.business.bookingmanagement.adapter.persistence;


import com.devonfw.training.hexagonal.business.bookingmanagement.adapter.persistence.mapper.BookingManagementPersistenceMapper;
import com.devonfw.training.hexagonal.business.bookingmanagement.adapter.persistence.repository.BookingJpaRepository;
import com.devonfw.training.hexagonal.business.bookingmanagement.core.boundary.required.persistence.FindAllBookingPersistencePort;
import com.devonfw.training.hexagonal.business.bookingmanagement.core.domain.entity.Booking;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class FindAllBookingPersistence implements FindAllBookingPersistencePort {

  private final BookingManagementPersistenceMapper mapper;

  private final BookingJpaRepository bookingJpaRepository;

  @Override
  public List<Booking> findAll() {
    return mapper.map(
        bookingJpaRepository.findAll());
  }
}
