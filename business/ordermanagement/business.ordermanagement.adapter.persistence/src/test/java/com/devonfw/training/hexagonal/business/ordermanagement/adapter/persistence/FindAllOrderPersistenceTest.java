package com.devonfw.training.hexagonal.business.ordermanagement.adapter.persistence;

import com.devonfw.training.hexagonal.business.ordermanagement.adapter.persistence.testconfiguration.TestConfiguration;
import com.devonfw.training.hexagonal.business.ordermanagement.adapter.persistence.testdata.OrderTestData;
import com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import javax.transaction.Transactional;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ContextConfiguration(classes = TestConfiguration.class)
@Transactional
public class FindAllOrderPersistenceTest {

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