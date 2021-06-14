package com.devonfw.training.hexagonal.business.bookingmanagement.core.logic.usecase;


import com.devonfw.training.hexagonal.business.bookingmanagement.core.port.provided.usecase.DeleteBookingUseCasePort;
import com.devonfw.training.hexagonal.business.bookingmanagement.core.port.required.persistence.DeleteBookingPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DeleteBookingUseCase implements DeleteBookingUseCasePort {

  private final DeleteBookingPersistencePort deleteBookingPersistencePort;

  @Override
  public void delete(Long id) {
    deleteBookingPersistencePort.delete(id);
  }
}
