package com.devonfw.training.hexagonal.business.ordermanagement.adapter.connection;

import com.devonfw.training.hexagonal.business.ordermanagement.core.dto.BookingMail;
import com.devonfw.training.hexagonal.business.ordermanagement.core.port.required.usecase.GetBookingMailUseCasePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookingManagementConnection implements GetBookingMailUseCasePort {

  private final com.devonfw.training.hexagonal.business.bookingmanagement.core.port.provided.usecase.GetBookingMailUseCasePort getBookingMailUseCasePort;

  @Override
  public BookingMail getBookingMail(Long id) {
    return getBookingMailUseCasePort.getBookingMail(id);
  }
}
