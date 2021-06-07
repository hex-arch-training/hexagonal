package com.devonfw.training.hexagonal.business.bookingmanagement.adapter.persistence;

import com.devonfw.training.hexagonal.business.bookingmanagement.adapter.persistence.testconfiguration.TestConfiguration;
import com.devonfw.training.hexagonal.business.bookingmanagement.adapter.persistence.testdata.BookingTestData;
import com.devonfw.training.hexagonal.business.bookingmanagement.core.domain.entity.Booking;
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
public class DeleteBookingPersistenceTest {

  @Autowired
  private SaveBookingPersistence saveBookingPersistence;

  @Autowired
  private FindAllBookingPersistence findAllBookingPersistence;

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
