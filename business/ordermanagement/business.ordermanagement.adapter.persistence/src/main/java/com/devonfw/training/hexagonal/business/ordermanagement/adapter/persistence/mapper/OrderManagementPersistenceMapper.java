package com.devonfw.training.hexagonal.business.ordermanagement.adapter.persistence.mapper;

import com.devonfw.training.hexagonal.business.ordermanagement.adapter.persistence.entity.OrderJpaEntity;
import com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity.Order;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface OrderManagementPersistenceMapper {

  OrderJpaEntity map(Order order);

  Order map(OrderJpaEntity order);

  List<Order> map(List<OrderJpaEntity> order);
}
