package com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class OrderLineTest {

  private final static Long orderLineId = 1L;

  private final static Long dishId = 2L;

  private final static List<Long> extrasIds = Lists.list(3L, 4L);

  private final static Integer amount = 5;

  private final static String comment = "a";

  @Test
  public void withoutId() {
    // given, when
    OrderLine orderLine = OrderLine.withoutId(dishId, extrasIds, amount, comment);
    // then
    assertThat(orderLine.getOrderLineId()).isNull();
    assertThat(orderLine.getDishId()).isEqualTo(dishId);
    assertThat(orderLine.getAmount()).isEqualTo(amount);
    assertThat(orderLine.getComment()).isEqualTo(comment);
  }

  @Test
  public void withId() {
    // given, when
    OrderLine orderLine = OrderLine.withId(orderLineId, dishId, extrasIds, amount, comment);
    // then
    assertThat(orderLine.getOrderLineId()).isEqualTo(orderLineId);
    assertThat(orderLine.getDishId()).isEqualTo(dishId);
    assertThat(orderLine.getAmount()).isEqualTo(amount);
    assertThat(orderLine.getComment()).isEqualTo(comment);
  }
}