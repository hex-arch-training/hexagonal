package com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Order {

  private Long id;

  private Long version;

  private Long bookingId;

  private Long invitedGuestId;

  private Long hostId;

  private List<OrderLine> orderLines;

  public static Order withoutId(Long bookingId,
                                Long invitedGuestId,
                                Long hostId,
                                List<OrderLine> orderLines) {
    return new Order(null, null, bookingId, invitedGuestId, hostId, orderLines);
  }

  public static Order withId(Long id,
                             Long version,
                             Long bookingId,
                             Long invitedGuestId,
                             Long hostId,
                             List<OrderLine> orderLines) {
    return new Order(id, version, bookingId, invitedGuestId, hostId, orderLines);
  }
}
