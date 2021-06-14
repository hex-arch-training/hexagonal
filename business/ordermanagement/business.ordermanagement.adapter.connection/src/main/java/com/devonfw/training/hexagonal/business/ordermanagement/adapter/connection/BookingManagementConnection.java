package com.devonfw.training.hexagonal.business.ordermanagement.adapter.connection;

import com.devonfw.training.hexagonal.business.bookingmanagement.core.domain.entity.Booking;
import com.devonfw.training.hexagonal.business.ordermanagement.core.port.required.usecase.DeleteBookingUseCasePort;
import com.devonfw.training.hexagonal.business.ordermanagement.core.port.required.usecase.FindBookingUseCasePort;
import com.devonfw.training.hexagonal.business.ordermanagement.core.port.required.usecase.SaveBookingUseCasePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookingManagementConnection implements FindBookingUseCasePort, DeleteBookingUseCasePort, SaveBookingUseCasePort {

  private final com.devonfw.training.hexagonal.business.bookingmanagement.core.port.provided.usecase.FindBookingUseCasePort findBookingUseCasePort;
  private final com.devonfw.training.hexagonal.business.bookingmanagement.core.port.provided.usecase.DeleteBookingUseCasePort deleteBookingUseCasePort;
  private final com.devonfw.training.hexagonal.business.bookingmanagement.core.port.provided.usecase.SaveBookingUseCasePort saveBookingUseCasePort;

  @Override
  public void delete(Long id) {
    deleteBookingUseCasePort.delete(id);
  }

  @Override
  public List<Booking> findAll() {
    return findBookingUseCasePort.findAll();
  }

  @Override
  public Booking findById(Long id) {
    return findBookingUseCasePort.findById(id);
  }

  @Override
  public Booking save(Booking booking) {
    return saveBookingUseCasePort.save(booking);
  }
}
