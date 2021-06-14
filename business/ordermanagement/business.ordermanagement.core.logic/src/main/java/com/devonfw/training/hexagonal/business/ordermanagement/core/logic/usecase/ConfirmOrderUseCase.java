package com.devonfw.training.hexagonal.business.ordermanagement.core.logic.usecase;


import com.devonfw.training.hexagonal.business.bookingmanagement.core.domain.entity.Booking;
import com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity.Order;
import com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity.OrderExtraIngredient;
import com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity.OrderLine;
import com.devonfw.training.hexagonal.business.ordermanagement.core.port.provided.exception.NoBookingException;
import com.devonfw.training.hexagonal.business.ordermanagement.core.port.required.service.SendOrderConfirmationEmailServicePort;
import com.devonfw.training.hexagonal.business.ordermanagement.core.port.required.usecase.FindBookingUseCasePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ConfirmOrderUseCase {

  private final SendOrderConfirmationEmailServicePort sendOrderConfirmationEmailServicePort;

  private final FindBookingUseCasePort findBookingUseCasePort;

  public void confirmationOrder(Order order) {

    String emailTo = getBookingEmail(order);
    StringBuilder mailContent = new StringBuilder();
    mailContent.append("MY THAI STAR").append(System.lineSeparator())
        .append("Hi ").append(order.getHostName()).append(System.lineSeparator())
        .append("Your order has been created.").append(System.lineSeparator())
        .append(System.lineSeparator())
        .append(getFormattedOrder(order)).append(System.lineSeparator());
    sendOrderConfirmationEmailServicePort.sendOrderConfirmationEmail(emailTo, "Order confirmation", mailContent.toString());
  }

  private String getFormattedOrder(Order order) {

    StringBuilder content = new StringBuilder();
    for (OrderLine orderLine : order.getOrderLines()) {
      content.append(orderLine.getDish())
          .append(", x").append(orderLine.getAmount())
          .append(".")
          .append(getFormattedOrderExtraIngredients(orderLine));
    }
    return content.toString();
  }

  private String getFormattedOrderExtraIngredients(OrderLine orderLine) {
    return orderLine.getOrderExtraIngredients().stream()
        .map(OrderExtraIngredient::getIngredient)
        .collect(Collectors.joining(",", " Extras: ", "."));
  }

  private String getBookingEmail(Order order) {
    Booking booking = findBookingUseCasePort.findById(order.getBookingId());
    if (booking == null) {
      throw new NoBookingException();
    }
    return booking.getEmail();
  }

}
