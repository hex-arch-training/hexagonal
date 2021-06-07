package com.devonfw.training.hexagonal.business.bookingmanagement.core.boundary.provided.usecase;

import com.devonfw.training.hexagonal.business.bookingmanagement.core.domain.entity.Booking;

public interface SaveBookingUseCasePort {

  Booking saveBooking(Booking booking);

}
