package com.devonfw.training.hexagonal.business.ordermanagement.adapter.persistence;

import com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity.Order;
import com.devonfw.training.hexagonal.business.ordermanagement.core.domain.test.testdata.OrderTestData;
import com.devonfw.training.hexagonal.util.persistence.test.base.BasePersistenceTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class DeleteOrderPersistenceTest extends BasePersistenceTest {

  @Autowired
  private SaveOrderPersistence saveOrderPersistence;

  @Autowired
  private FindAllOrderPersistence findAllOrderPersistence;

  @Autowired
  private DeleteOrderPersistence deleteOrderPersistence;

  @Test
  public void delete() {
    // given
    Order order1 = OrderTestData.withoutId(1L);
    Order order2 = OrderTestData.withoutId(2L);
    Order savedOrder1 = saveOrderPersistence.save(order1);
    Order savedOrder2 = saveOrderPersistence.save(order2);

    // when
    deleteOrderPersistence.delete(savedOrder1.getId());

    // then
    List<Order> orders = findAllOrderPersistence.findAll();
    assertThat(orders).hasSize(1);
    assertThat(orders.stream().anyMatch(o -> o.getId() == savedOrder1.getId())).isFalse();
  }


}