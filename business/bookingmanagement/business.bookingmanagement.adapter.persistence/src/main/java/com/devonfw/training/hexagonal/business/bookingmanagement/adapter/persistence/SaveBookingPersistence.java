package com.devonfw.training.hexagonal.business.bookingmanagement.adapter.persistence;


import com.devonfw.training.hexagonal.business.bookingmanagement.adapter.persistence.mapper.BookingManagementPersistenceMapper;
import com.devonfw.training.hexagonal.business.bookingmanagement.adapter.persistence.repository.BookingJpaRepository;
import com.devonfw.training.hexagonal.business.bookingmanagement.core.port.required.persistence.SaveBookingPersistencePort;
import com.devonfw.training.hexagonal.business.bookingmanagement.core.domain.entity.Booking;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SaveBookingPersistence implements SaveBookingPersistencePort {

  private final BookingManagementPersistenceMapper mapper;

  private final BookingJpaRepository bookingJpaRepository;

  @Override
  public Booking save(Booking booking) {
    return mapper.map(
        bookingJpaRepository.save(
            mapper.map(booking)));
  }
}
