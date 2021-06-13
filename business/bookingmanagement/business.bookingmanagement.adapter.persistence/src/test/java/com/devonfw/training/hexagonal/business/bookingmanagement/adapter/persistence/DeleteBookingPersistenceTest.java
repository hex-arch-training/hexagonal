package com.devonfw.training.hexagonal.business.bookingmanagement.adapter.persistence;

import com.devonfw.training.hexagonal.business.bookingmanagement.core.domain.entity.Booking;
import com.devonfw.training.hexagonal.business.bookingmanagement.core.domain.test.testdata.BookingTestData;
import com.devonfw.training.hexagonal.util.persistence.test.base.BasePersistenceTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class DeleteBookingPersistenceTest extends BasePersistenceTest {

  @Autowired
  private SaveBookingPersistence saveBookingPersistence;

  @Autowired
  private FindBookingPersistence findAllBookingPersistence;

  @Autowired
  private DeleteBookingPersistence deleteBookingPersistence;

  @Test
  public void delete() {
    // given
    Booking booking1 = BookingTestData.withoutId("a token");
    Booking booking2 = BookingTestData.withoutId("b token");
    Booking savedBooking1 = saveBookingPersistence.save(booking1);
    Booking savedBooking2 = saveBookingPersistence.save(booking2);

    // when
    deleteBookingPersistence.delete(savedBooking1.getId());

    // then
    List<Booking> bookings = findAllBookingPersistence.findAll();
    assertThat(bookings).hasSize(1);
  }


}
