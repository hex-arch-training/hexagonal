package com.devonfw.training.hexagonal.business.ordermanagement.adapter.persistence.testdata;

import com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity.OrderExtraIngredient;

public class OrderExtraIngredientTestData {

  public final static Long id = 1L;

  public final static Long version = 2L;

  public final static Long ingredientId = 3L;

  public static OrderExtraIngredient withoutId() {
    return withoutId(ingredientId);
  }

  public static OrderExtraIngredient withoutId(Long ingredientId) {
    return OrderExtraIngredient.withoutId(ingredientId);
  }

  public static OrderExtraIngredient withId() {
    return withId(id, version);
  }

  public static OrderExtraIngredient withId(Long id, Long version) {
    return OrderExtraIngredient.withId(id, version, ingredientId);
  }
}