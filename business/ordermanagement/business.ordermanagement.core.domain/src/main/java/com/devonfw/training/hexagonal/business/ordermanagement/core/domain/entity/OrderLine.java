package com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class OrderLine {

  private Long id;

  private Long version;

  private Long dishId;

  private List<OrderExtraIngredient> orderExtraIngredients;

  private Integer amount;

  private String comment;

  public static OrderLine withoutId(Long dishId,
                                    List<OrderExtraIngredient> orderExtraIngredients,
                                    Integer amount,
                                    String comment) {
    return new OrderLine(null, null, dishId, orderExtraIngredients, amount, comment);
  }

  public static OrderLine withId(Long id,
                                 Long version,
                                 Long dishId,
                                 List<OrderExtraIngredient> orderExtraIngredients,
                                 Integer amount,
                                 String comment) {
    return new OrderLine(id, version, dishId, orderExtraIngredients, amount, comment);
  }
}
