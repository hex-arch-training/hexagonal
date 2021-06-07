package com.devonfw.training.hexagonal.business.ordermanagement.adapter.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;
import java.util.List;

@Entity
@Table(name = "ta_order_line")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderLineJpaEntity {

  @Id
  @GeneratedValue
  private Long id;

  @Version
  private Long version;

  @Column
  private String dish;

  @OneToMany(mappedBy = "orderLine", cascade = CascadeType.ALL)
  private List<OrderExtraIngredientJpaEntity> orderExtraIngredients;

  @Column
  private Integer amount;

  @Column
  private String comment;

  @ManyToOne
  @JoinColumn(name = "order_id")
  private OrderJpaEntity order;

}
