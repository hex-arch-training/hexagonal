package com.devonfw.training.hexagonal.business.ordermanagement.adapter.persistence.testdata;

import com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity.OrderExtraIngredient;
import com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity.OrderLine;
import org.assertj.core.util.Lists;

import java.util.List;

public class OrderLineTestData {

  public final static Long id = 1L;

  public final static Long version = 2L;

  public final static Long dishId = 3L;

  public final static List<OrderExtraIngredient> orderExtraIngredientsWithId = Lists.list(
      OrderExtraIngredientTestData.withId(5L, 1L),
      OrderExtraIngredientTestData.withId(6L, 2L));

  public final static List<OrderExtraIngredient> orderExtraIngredientsWithoutId = Lists.list(
      OrderExtraIngredientTestData.withoutId(7L),
      OrderExtraIngredientTestData.withoutId(8L));

  public final static Integer amount = 4;

  public final static String comment = "a";

  public static OrderLine withoutId() {
    return withoutId(dishId);
  }

  public static OrderLine withoutId(Long dishId) {
    return OrderLine.withoutId(dishId, orderExtraIngredientsWithoutId, amount, comment);
  }

  public static OrderLine withId() {
    return withId(id, version);
  }

  public static OrderLine withId(Long id, Long version) {
    return OrderLine.withId(id, version, dishId, orderExtraIngredientsWithId, amount, comment);
  }
}