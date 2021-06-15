package com.devonfw.training.hexagonal.business.ordermanagement.adapter.persistence.mapper;

import com.devonfw.training.hexagonal.business.ordermanagement.adapter.persistence.entity.OrderExtraIngredientJpaEntity;
import com.devonfw.training.hexagonal.business.ordermanagement.adapter.persistence.entity.OrderJpaEntity;
import com.devonfw.training.hexagonal.business.ordermanagement.adapter.persistence.entity.OrderLineJpaEntity;
import com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity.Order;
import com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity.OrderExtraIngredient;
import com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity.OrderLine;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Mapper
public interface OrderManagementPersistenceMapper {

  OrderJpaEntity map(Order order);

  @Mapping(target = "order", ignore = true)
  OrderLineJpaEntity map(OrderLine orderLine);

  @Mapping(target = "orderLine", ignore = true)
  OrderExtraIngredientJpaEntity map(OrderExtraIngredient orderExtraIngredient);

  Order map(OrderJpaEntity order);

  List<Order> map(List<OrderJpaEntity> order);

  @AfterMapping
  default void afterMapping(@MappingTarget OrderJpaEntity order) {
    Optional.ofNullable(order.getOrderLines())
        .stream()
        .flatMap(Collection::stream)
        .forEach(ol -> ol.setOrder(order));
  }

  @AfterMapping
  default void afterMapping(@MappingTarget OrderLineJpaEntity orderLine) {
    Optional.ofNullable(orderLine.getOrderExtraIngredients())
        .stream()
        .flatMap(Collection::stream)
        .forEach(oei -> oei.setOrderLine(orderLine));
  }

}
