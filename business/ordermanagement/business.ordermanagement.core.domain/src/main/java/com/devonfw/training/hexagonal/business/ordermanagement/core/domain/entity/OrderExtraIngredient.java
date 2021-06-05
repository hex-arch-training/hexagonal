package com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class OrderExtraIngredient {

  private Long id;

  private Long version;

  private Long ingredientId;

  public static OrderExtraIngredient withoutId(Long ingredientId) {
    return new OrderExtraIngredient(null, null, ingredientId);
  }

  public static OrderExtraIngredient withId(Long id,
                                            Long version,
                                            Long ingredientId) {
    return new OrderExtraIngredient(id, version, ingredientId);
  }
}
