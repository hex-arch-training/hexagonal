package com.devonfw.training.hexagonal.business.bookingmanagement.core.port.required.persistence;

import com.devonfw.training.hexagonal.business.bookingmanagement.core.domain.entity.Booking;

public interface SaveBookingPersistencePort {

  Booking save(Booking booking);

}
