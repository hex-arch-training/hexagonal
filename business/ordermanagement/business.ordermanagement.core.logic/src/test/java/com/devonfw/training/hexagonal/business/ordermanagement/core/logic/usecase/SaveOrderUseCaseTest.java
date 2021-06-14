package com.devonfw.training.hexagonal.business.ordermanagement.core.logic.usecase;

import com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity.Order;
import com.devonfw.training.hexagonal.business.ordermanagement.core.domain.test.testdata.OrderTestData;
import com.devonfw.training.hexagonal.business.ordermanagement.core.port.required.persistence.SaveOrderPersistencePort;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SaveOrderUseCaseTest {

  @InjectMocks
  private SaveOrderUseCase saveOrderUseCase;

  @Mock
  private ConfirmOrderUseCase confirmOrderUseCase;

  @Mock
  private SaveOrderPersistencePort saveOrderPersistencePort;

  @Test
  public void save() {
    // given
    Order order = OrderTestData.withoutId();
    Order orderWithId = OrderTestData.withId();
    when(saveOrderPersistencePort.save(order)).thenReturn(orderWithId);

    // when
    Order orderSaved = saveOrderUseCase.save(order);

    // then
    assertThat(orderSaved).isNotNull();
    assertThat(orderSaved.getBookingId()).isEqualTo(orderWithId.getBookingId());
    verify(confirmOrderUseCase).confirmationOrder(order);
  }
}