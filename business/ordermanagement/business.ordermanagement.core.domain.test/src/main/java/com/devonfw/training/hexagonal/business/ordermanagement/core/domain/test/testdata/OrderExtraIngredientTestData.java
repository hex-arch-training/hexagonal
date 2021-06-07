package com.devonfw.training.hexagonal.business.ordermanagement.core.domain.test.testdata;

import com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity.OrderExtraIngredient;

public class OrderExtraIngredientTestData {

  public final static Long id = 1L;

  public final static Long version = 2L;

  public final static String ingredient = "an ingredient";

  public static OrderExtraIngredient withoutId() {
    return withoutId(ingredient);
  }

  public static OrderExtraIngredient withoutId(String ingredient) {
    return OrderExtraIngredient.withoutId(ingredient);
  }

  public static OrderExtraIngredient withId() {
    return withId(id, version);
  }

  public static OrderExtraIngredient withId(Long id, Long version) {
    return OrderExtraIngredient.withId(id, version, ingredient);
  }
}