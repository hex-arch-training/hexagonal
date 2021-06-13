package com.devonfw.training.hexagonal.business.ordermanagement.core.logic.usecase;


import com.devonfw.training.hexagonal.business.bookingmanagement.core.domain.entity.Booking;
import com.devonfw.training.hexagonal.business.bookingmanagement.core.port.provided.exception.NoBookingException;
import com.devonfw.training.hexagonal.business.bookingmanagement.core.port.provided.usecase.FindBookingUseCasePort;
import com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ValidateOrderUseCase {

  private final FindBookingUseCasePort findBookingUseCasePort;

  public void validateOrder(Order order) {

    Booking booking = findBookingUseCasePort.findById(order.getBookingId());
    if (booking == null) {
      throw new NoBookingException();
    }
  }
}
