package com.devonfw.training.hexagonal.business.bookingmanagement.core.logic.usecase;


import com.devonfw.training.hexagonal.business.bookingmanagement.core.domain.entity.Booking;
import com.devonfw.training.hexagonal.business.bookingmanagement.core.port.provided.usecase.FindBookingUseCasePort;
import com.devonfw.training.hexagonal.business.bookingmanagement.core.port.required.persistence.FindBookingPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class FindBookingUseCase implements FindBookingUseCasePort {

  private final FindBookingPersistencePort findBookingPersistencePort;

  @Override
  public Booking findById(Long id) {
    return findBookingPersistencePort.findById(id);
  }

}
