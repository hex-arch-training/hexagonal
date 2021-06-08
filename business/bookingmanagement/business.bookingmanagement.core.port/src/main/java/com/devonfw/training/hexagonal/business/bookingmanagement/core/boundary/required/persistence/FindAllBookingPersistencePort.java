package com.devonfw.training.hexagonal.business.bookingmanagement.core.port.required.persistence;

import com.devonfw.training.hexagonal.business.bookingmanagement.core.domain.entity.Booking;

import java.util.List;

public interface FindAllBookingPersistencePort {

  List<Booking> findAll();

}
