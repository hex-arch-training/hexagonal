package com.devonfw.training.hexagonal.business.bookingmanagement.core.port.provided.usecase;

import com.devonfw.training.hexagonal.business.ordermanagement.core.dto.BookingMail;

public interface GetBookingMailUseCasePort {

  BookingMail getBookingMail(Long bookingId);

}
