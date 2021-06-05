package com.devonfw.training.hexagonal.business.ordermanagement.adapter.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "ta_order_extra_ingredient")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderExtraIngredientJpaEntity {

  @Id
  @GeneratedValue
  private Long id;

  @Version
  private Long version;

  @Column(name = "ingredient_id")
  private Long ingredientId;

  @ManyToOne
  @JoinColumn(name = "order_line_id")
  private OrderLineJpaEntity orderLine;

}
