package com.devonfw.training.hexagonal.business.ordermanagement.core.logic.usecase;


import com.devonfw.training.hexagonal.business.ordermanagement.core.port.provided.usecase.SaveOrderUseCasePort;
import com.devonfw.training.hexagonal.business.ordermanagement.core.port.required.persistence.SaveOrderPersistencePort;
import com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SaveOrderUseCase implements SaveOrderUseCasePort {

  private final SaveOrderPersistencePort saveOrderPersistencePort;

  @Override
  public Order saveOrder(Order order) {
    Order validatedOrder = getValidatedOrder(null, order);

    Order savedOrder = saveOrderPersistencePort.save(validatedOrder);

    sendOrderConfirmationEmail(null, savedOrder);

    return savedOrder;
  }


  private Order getValidatedOrder(String token, Order order) {

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

  private void sendOrderConfirmationEmail(String token, Order order) {
//
//    Objects.requireNonNull(token, "token");
//    Objects.requireNonNull(order, "order");
//    try {
//      String emailTo = getBookingOrGuestEmail(token);
//      StringBuilder mailContent = new StringBuilder();
//
//      mailContent.append("MY THAI STAR").append("\n");
//      mailContent.append("Hi ").append(emailTo).append("\n");
//      mailContent.append("Your order has been created.").append("\n");
//      mailContent.append(getContentFormatedWithCost(order)).append("\n");
//      mailContent.append("\n").append("Link to cancel order: ");
//      String link = "http://localhost:" + this.clientPort + "/booking/cancelOrder/" + order.getId();
//      mailContent.append(link);
//      this.mailService.sendMail(emailTo, "Order confirmation", mailContent.toString());
//    } catch (Exception e) {
//      LOG.error("Email not sent. {}", e.getMessage());
//    }
  }
}
