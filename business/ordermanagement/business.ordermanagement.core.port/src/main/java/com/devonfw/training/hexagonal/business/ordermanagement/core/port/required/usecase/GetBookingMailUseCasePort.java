package com.devonfw.training.hexagonal.business.ordermanagement.core.port.required.usecase;

import com.devonfw.training.hexagonal.business.ordermanagement.core.dto.BookingMail;

public interface GetBookingMailUseCasePort {

  BookingMail getBookingMail(Long bookingId);

}
