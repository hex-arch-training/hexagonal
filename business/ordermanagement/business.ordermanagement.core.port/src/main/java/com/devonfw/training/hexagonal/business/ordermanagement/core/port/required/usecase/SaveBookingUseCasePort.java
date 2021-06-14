package com.devonfw.training.hexagonal.business.ordermanagement.core.port.required.usecase;

import com.devonfw.training.hexagonal.business.bookingmanagement.core.domain.entity.Booking;

public interface SaveBookingUseCasePort {

  Booking save(Booking booking);

}
