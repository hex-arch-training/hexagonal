package com.devonfw.training.hexagonal.business.bookingmanagement.adapter.persistence;


import com.devonfw.training.hexagonal.business.bookingmanagement.adapter.persistence.repository.BookingJpaRepository;
import com.devonfw.training.hexagonal.business.bookingmanagement.core.port.required.persistence.DeleteBookingPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DeleteBookingPersistence implements DeleteBookingPersistencePort {

  private final BookingJpaRepository bookingJpaRepository;

  @Override
  public void delete(Long id) {
    bookingJpaRepository.deleteById(id);
  }
}
