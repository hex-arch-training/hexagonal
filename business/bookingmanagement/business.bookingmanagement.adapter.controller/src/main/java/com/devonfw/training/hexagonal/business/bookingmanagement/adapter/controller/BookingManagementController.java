package com.devonfw.training.hexagonal.business.bookingmanagement.adapter.controller;

import com.devonfw.training.hexagonal.business.bookingmanagement.core.domain.entity.Booking;
import com.devonfw.training.hexagonal.business.bookingmanagement.core.port.provided.usecase.DeleteBookingUseCasePort;
import com.devonfw.training.hexagonal.business.bookingmanagement.core.port.provided.usecase.FindBookingUseCasePort;
import com.devonfw.training.hexagonal.business.bookingmanagement.core.port.provided.usecase.SaveBookingUseCasePort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("bookingmanagement")
public class BookingManagementController {

  private final SaveBookingUseCasePort saveBookingUseCasePort;
  private final FindBookingUseCasePort findBookingUseCasePort;
  private final DeleteBookingUseCasePort deleteBookingUseCasePort;

  @PostMapping(value = "/booking",
      consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public Booking save(@RequestBody Booking booking) {
    return saveBookingUseCasePort.save(booking);
  }

  @GetMapping(value = "/booking/{id}",
      produces = MediaType.APPLICATION_JSON_VALUE)
  public Booking getById(@RequestParam Long id) {
    return findBookingUseCasePort.findById(id);
  }

  @GetMapping(value = "/booking",
      produces = MediaType.APPLICATION_JSON_VALUE)
  public List<Booking> getAll() {
    return findBookingUseCasePort.findAll();
  }

  @DeleteMapping(value = "/booking/{id}")
  public void delete(@RequestParam Long id) {
    deleteBookingUseCasePort.delete(id);
  }
}
