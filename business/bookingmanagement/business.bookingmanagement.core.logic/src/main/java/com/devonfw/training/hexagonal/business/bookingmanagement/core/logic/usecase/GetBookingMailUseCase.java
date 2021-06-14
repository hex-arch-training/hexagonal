package com.devonfw.training.hexagonal.business.bookingmanagement.core.logic.usecase;


import com.devonfw.training.hexagonal.business.bookingmanagement.core.port.provided.usecase.GetBookingMailUseCasePort;
import com.devonfw.training.hexagonal.business.bookingmanagement.core.port.required.persistence.FindBookingPersistencePort;
import com.devonfw.training.hexagonal.business.ordermanagement.core.dto.BookingMail;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class GetBookingMailUseCase implements GetBookingMailUseCasePort {

  private final FindBookingPersistencePort findBookingPersistencePort;

  @Override
  public BookingMail getBookingMail(Long bookingId) {
    return Optional.of(findBookingPersistencePort.findById(bookingId))
        .map(b -> new BookingMail(b.getEmail()))
        .orElse(null);
  }
}
