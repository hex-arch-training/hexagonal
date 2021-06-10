package com.devonfw.training.hexagonal.business.ordermanagement.core.logic.usecase;


import com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity.Order;
import com.devonfw.training.hexagonal.business.ordermanagement.core.port.provided.usecase.ConfirmOrderUseCasePort;
import com.devonfw.training.hexagonal.business.ordermanagement.core.port.required.persistence.SaveOrderPersistencePort;
import com.devonfw.training.hexagonal.business.ordermanagement.core.port.required.service.SendOrderConfirmationEmailServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ConfirmOrderUseCase implements ConfirmOrderUseCasePort {

  private final SaveOrderPersistencePort saveOrderPersistencePort;

  private final SendOrderConfirmationEmailServicePort sendOrderConfirmationEmailServicePort;

  @Override
  public Order confirmOrder(Order order) {
    Order validatedOrder = getValidatedOrder(order);

    Order savedOrder = saveOrderPersistencePort.save(validatedOrder);

    sendOrderConfirmationEmail(savedOrder);

    return savedOrder;
  }


  private Order getValidatedOrder(Order order) {

//    // BOOKING VALIDATION
//    if (getOrderType(token) == BookingType.COMMON) {
//      BookingCto booking = getBookingbyToken(token);
//      if (booking == null) {
//        throw new NoBookingException();
//      }
//      List<OrderCto> currentOrders = getBookingOrders(booking.getBooking().getId());
//      if (!currentOrders.isEmpty()) {
//        throw new OrderAlreadyExistException();
//      }
//      orderEntity.setBookingId(booking.getBooking().getId());
//
//      // GUEST VALIDATION
//    } else if (getOrderType(token) == BookingType.INVITED) {
//
//      InvitedGuestEto guest = getInvitedGuestByToken(token);
//      if (guest == null) {
//        throw new NoInviteException();
//      }
//      List<OrderCto> currentGuestOrders = getInvitedGuestOrders(guest.getId());
//      if (!currentGuestOrders.isEmpty()) {
//        throw new OrderAlreadyExistException();
//      }
//      orderEntity.setBookingId(guest.getBookingId());
//      orderEntity.setInvitedGuestId(guest.getId());
//    }
//
//    return orderEntity;
    return order;

  }

  private void sendOrderConfirmationEmail(Order order) {

    String emailTo = getBookingOrGuestEmail(order);
    StringBuilder mailContent = new StringBuilder();
    mailContent.append("MY THAI STAR").append(System.lineSeparator())
        .append("Hi ").append(order.getHostName()).append(System.lineSeparator())
        .append("Your order has been created.").append(System.lineSeparator())
        .append(getContentFormattedWithCost(order)).append(System.lineSeparator());
    sendOrderConfirmationEmailServicePort.sendOrderConfirmationEmail(emailTo, "Order confirmation", mailContent.toString());
  }

  private String getContentFormattedWithCost(Order order) {
    return null;
  }

  private String getBookingOrGuestEmail(Order order) {
    return null;
  }
}
