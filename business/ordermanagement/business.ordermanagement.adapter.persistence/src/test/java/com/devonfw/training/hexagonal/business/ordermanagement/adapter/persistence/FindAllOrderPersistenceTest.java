package com.devonfw.training.hexagonal.business.ordermanagement.adapter.persistence;

import com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity.Order;
import com.devonfw.training.hexagonal.business.ordermanagement.core.domain.test.testdata.OrderTestData;
import com.devonfw.training.hexagonal.util.persistence.test.base.BasePersistenceTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FindAllOrderPersistenceTest extends BasePersistenceTest {

  @Autowired
  private SaveOrderPersistence saveOrderPersistence;

  @Autowired
  private FindAllOrderPersistence findAllOrderPersistence;

  @Test
  public void findAll() {
    // given
    Order order1 = OrderTestData.withoutId(1L);
    Order order2 = OrderTestData.withoutId(2L);
    saveOrderPersistence.save(order1);
    saveOrderPersistence.save(order2);

    // when
    List<Order> orders = findAllOrderPersistence.findAll();

    // then
    assertThat(orders).hasSize(2);
  }


}