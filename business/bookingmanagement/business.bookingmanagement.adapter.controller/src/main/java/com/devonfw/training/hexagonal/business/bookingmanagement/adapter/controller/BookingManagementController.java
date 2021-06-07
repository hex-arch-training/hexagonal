package com.devonfw.training.hexagonal.business.bookingmanagement.adapter.controller;

import com.devonfw.training.hexagonal.business.bookingmanagement.core.boundary.provided.usecase.SaveBookingUseCasePort;
import com.devonfw.training.hexagonal.business.bookingmanagement.core.domain.entity.Booking;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("bookingmanagement")
public class BookingManagementController {

  private final SaveBookingUseCasePort saveBookingUseCasePort;

  @PostMapping(value = "/booking",
      consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public Booking saveBooking(@RequestBody Booking booking) {
    return saveBookingUseCasePort.saveBooking(booking);
  }

  @GetMapping(value = "/booking",
      produces = MediaType.APPLICATION_JSON_VALUE)
  public Booking getBooking() {
    return null;
  }
}
