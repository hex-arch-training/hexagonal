package com.devonfw.training.hexagonal.business.ordermanagement.core.port.required.usecase;

import com.devonfw.training.hexagonal.business.bookingmanagement.core.domain.entity.Booking;

import java.util.List;

public interface FindBookingUseCasePort {

  Booking findById(Long id);

  List<Booking> findAll();

}
