package com.devonfw.training.hexagonal.business.ordermanagement.core.domain.test.testdata;

import com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity.OrderExtraIngredient;
import com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity.OrderLine;
import org.assertj.core.util.Lists;

import java.util.List;

public class OrderLineTestData {

  public final static Long id = 1L;

  public final static Long version = 2L;

  public final static String dish = "pizza";

  public final static List<OrderExtraIngredient> orderExtraIngredientsWithId = Lists.list(
      OrderExtraIngredientTestData.withId(5L, 1L),
      OrderExtraIngredientTestData.withId(6L, 2L));

  public final static List<OrderExtraIngredient> orderExtraIngredientsWithoutId = Lists.list(
      OrderExtraIngredientTestData.withoutId("tomato"),
      OrderExtraIngredientTestData.withoutId("olives"));

  public final static Integer amount = 4;

  public final static String comment = "a comment";

  public static OrderLine withoutId() {
    return withoutId(dish);
  }

  public static OrderLine withoutId(String dish) {
    return OrderLine.withoutId(dish, orderExtraIngredientsWithoutId, amount, comment);
  }

  public static OrderLine withId() {
    return withId(id, version);
  }

  public static OrderLine withId(Long id, Long version) {
    return OrderLine.withId(id, version, dish, orderExtraIngredientsWithId, amount, comment);
  }
}