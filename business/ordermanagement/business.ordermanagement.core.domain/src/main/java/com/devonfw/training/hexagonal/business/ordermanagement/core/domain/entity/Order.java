package com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
public class Order {

  @Getter
  private  Long orderId;

  @Getter
  private  Long bookingId;

  @Getter
  private  Long invitedGuestId;

  @Getter
  private  Long hostId;

  @Getter
  private  List<OrderLine> orderLines;

  public static Order withoutId(Long bookingId,
                                Long invitedGuestId,
                                Long hostId,
                                List<OrderLine> orderLines) {
    return new Order(null, bookingId, invitedGuestId, hostId, orderLines);
  }

  public static Order withId(Long orderId,
                             Long bookingId,
                             Long invitedGuestId,
                             Long hostId,
                             List<OrderLine> orderLines) {
    return new Order(orderId, bookingId, invitedGuestId, hostId, orderLines);
  }
}
