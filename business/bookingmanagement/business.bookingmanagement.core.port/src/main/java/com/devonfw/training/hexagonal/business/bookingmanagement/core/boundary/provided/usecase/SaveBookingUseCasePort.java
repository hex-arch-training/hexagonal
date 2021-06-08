package com.devonfw.training.hexagonal.business.bookingmanagement.core.port.provided.usecase;

import com.devonfw.training.hexagonal.business.bookingmanagement.core.domain.entity.Booking;

public interface SaveBookingUseCasePort {

  Booking saveBooking(Booking booking);

}
