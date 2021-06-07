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

  private String ingredient;

  public static OrderExtraIngredient withoutId(String ingredient) {
    return new OrderExtraIngredient(null, null, ingredient);
  }

  public static OrderExtraIngredient withId(Long id,
                                            Long version,
                                            String ingredient) {
    return new OrderExtraIngredient(id, version, ingredient);
  }
}
