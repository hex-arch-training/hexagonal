package com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
public class OrderLine {

  @Getter
  private Long orderLineId;

  @Getter
  private Long dishId;

  @Getter
  private List<Long> extrasIds;

  @Getter
  private Integer amount;

  @Getter
  private String comment;

  public static OrderLine withoutId(Long dishId,
                                    List<Long> extrasIds,
                                    Integer amount,
                                    String comment) {
    return new OrderLine(null, dishId, extrasIds, amount, comment);
  }

  public static OrderLine withId(Long orderLineId,
                                 Long dishId,
                                 List<Long> extrasIds,
                                 Integer amount,
                                 String comment) {
    return new OrderLine(orderLineId, dishId, extrasIds, amount, comment);
  }
}
