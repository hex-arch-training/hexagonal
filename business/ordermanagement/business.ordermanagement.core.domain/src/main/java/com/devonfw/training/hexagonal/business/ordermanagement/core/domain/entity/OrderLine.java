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

  private String dish;

  private List<OrderExtraIngredient> orderExtraIngredients;

  private Integer amount;

  private String comment;

  public static OrderLine withoutId(String dish,
                                    List<OrderExtraIngredient> orderExtraIngredients,
                                    Integer amount,
                                    String comment) {
    return new OrderLine(null, null, dish, orderExtraIngredients, amount, comment);
  }

  public static OrderLine withId(Long id,
                                 Long version,
                                 String dish,
                                 List<OrderExtraIngredient> orderExtraIngredients,
                                 Integer amount,
                                 String comment) {
    return new OrderLine(id, version, dish, orderExtraIngredients, amount, comment);
  }
}
