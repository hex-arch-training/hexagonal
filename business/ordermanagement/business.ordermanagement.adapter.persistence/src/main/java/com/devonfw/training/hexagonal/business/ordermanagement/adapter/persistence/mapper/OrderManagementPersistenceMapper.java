package com.devonfw.training.hexagonal.business.ordermanagement.adapter.persistence.mapper;

import com.devonfw.training.hexagonal.business.ordermanagement.adapter.persistence.entity.OrderExtraIngredientJpaEntity;
import com.devonfw.training.hexagonal.business.ordermanagement.adapter.persistence.entity.OrderJpaEntity;
import com.devonfw.training.hexagonal.business.ordermanagement.adapter.persistence.entity.OrderLineJpaEntity;
import com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity.Order;
import com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity.OrderExtraIngredient;
import com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity.OrderLine;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface OrderManagementPersistenceMapper {

  OrderJpaEntity map(Order order);

  @Mapping(target = "order", ignore = true)
  OrderLineJpaEntity map(OrderLine orderLine);

  @Mapping(target = "orderLine", ignore = true)
  OrderExtraIngredientJpaEntity map(OrderExtraIngredient orderExtraIngredient);

  Order map(OrderJpaEntity order);

  List<Order> map(List<OrderJpaEntity> order);


}
