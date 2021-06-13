package com.devonfw.training.hexagonal.business.bookingmanagement.core.logic.usecase;


import com.devonfw.training.hexagonal.business.bookingmanagement.core.domain.entity.Booking;
import com.devonfw.training.hexagonal.business.bookingmanagement.core.port.provided.usecase.SaveBookingUseCasePort;
import com.devonfw.training.hexagonal.business.bookingmanagement.core.port.required.persistence.SaveBookingPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SaveBookingUseCase implements SaveBookingUseCasePort {

  private final SaveBookingPersistencePort saveBookingPersistencePort;

  @Override
  public Booking saveBooking(Booking booking) {
    return saveBookingPersistencePort.save(booking);
  }
}
