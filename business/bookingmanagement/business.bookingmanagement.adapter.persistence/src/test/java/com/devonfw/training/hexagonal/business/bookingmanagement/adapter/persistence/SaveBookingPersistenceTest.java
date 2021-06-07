package com.devonfw.training.hexagonal.business.bookingmanagement.adapter.persistence;

import com.devonfw.training.hexagonal.business.bookingmanagement.core.domain.entity.Booking;
import com.devonfw.training.hexagonal.business.bookingmanagement.core.domain.entity.BookingTable;
import com.devonfw.training.hexagonal.business.bookingmanagement.core.domain.entity.InvitedGuest;
import com.devonfw.training.hexagonal.business.bookingmanagement.core.domain.test.testdata.BookingTestData;
import com.devonfw.training.hexagonal.util.persistence.test.base.BasePersistenceTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SaveBookingPersistenceTest extends BasePersistenceTest {

  @Autowired
  private SaveBookingPersistence saveBookingPersistence;

  @Test
  public void save() {
    // given
    Booking booking = BookingTestData.withoutId();

    // when
    Booking createdBooking = saveBookingPersistence.save(booking);

    // then
    assertBooking(booking, createdBooking);
  }

  private void assertBooking(Booking booking, Booking createdBooking) {
    assertThat(createdBooking).isNotNull();
    assertThat(createdBooking.getId()).isNotNull();
    assertThat(createdBooking.getVersion()).isNotNull();
    assertThat(createdBooking.getName()).isEqualTo(booking.getName());
    assertBookingTable(booking.getBookingTable(), createdBooking.getBookingTable());
    assertInvitedGuests(booking.getInvitedGuests(), createdBooking.getInvitedGuests());
  }

  private void assertBookingTable(BookingTable bookingTable, BookingTable createdBookingTable) {
    assertThat(createdBookingTable.getId()).isNotNull();
    assertThat(createdBookingTable.getVersion()).isNotNull();
    assertThat(createdBookingTable.getSeatsNumber()).isEqualTo(bookingTable.getSeatsNumber());
  }

  private void assertInvitedGuests(List<InvitedGuest> invitedGuests, List<InvitedGuest> createdInvitedGuests) {
    assertThat(invitedGuests.size()).isEqualTo(createdInvitedGuests.size());

    createdInvitedGuests.stream().
        forEach(ol -> {
          assertThat(ol.getId()).isNotNull();
          assertThat(ol.getVersion()).isNotNull();
        });
  }
}




