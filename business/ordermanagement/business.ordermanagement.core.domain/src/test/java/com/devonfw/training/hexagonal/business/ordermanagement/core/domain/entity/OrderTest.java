package com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class OrderTest {

  private final static Long orderId = 1L;

  private final static Long bookingId = 2L;

  private final static Long invitedGuestId = 3L;

  private final static Long hostId = 4L;

  private final static List<OrderLine> orderLines = Lists.list(createOrderLine(5L), createOrderLine(6L));

  @Test
  public void withoutId() {
    // given, when
    Order order = Order.withoutId(bookingId, invitedGuestId, hostId, orderLines);
    // then
    assertThat(order.getOrderId()).isNull();
    assertThat(order.getBookingId()).isEqualTo(bookingId);
    assertThat(order.getInvitedGuestId()).isEqualTo(invitedGuestId);
    assertThat(order.getHostId()).isEqualTo(hostId);
    assertThat(order.getOrderLines()).isEqualTo(orderLines);
  }

  @Test
  public void withId() {
    // given, when
    Order order = Order.withId(orderId, bookingId, invitedGuestId, hostId, orderLines);
    // then
    assertThat(order.getOrderId()).isEqualTo(orderId);
    assertThat(order.getBookingId()).isEqualTo(bookingId);
    assertThat(order.getInvitedGuestId()).isEqualTo(invitedGuestId);
    assertThat(order.getHostId()).isEqualTo(hostId);
    assertThat(order.getOrderLines()).isEqualTo(orderLines);
  }

  private static OrderLine createOrderLine(Long orderLineId) {
    return OrderLine.withId(orderLineId, 1L, Lists.list(2L, 3L), 4, "a");
  }
}