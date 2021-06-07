package com.devonfw.training.hexagonal.business.bookingmanagement.adapter.persistence.testdata;

import com.devonfw.training.hexagonal.business.bookingmanagement.core.domain.entity.Booking;
import com.devonfw.training.hexagonal.business.bookingmanagement.core.domain.entity.BookingTable;
import com.devonfw.training.hexagonal.business.bookingmanagement.core.domain.entity.InvitedGuest;
import com.devonfw.training.hexagonal.business.bookingmanagement.core.domain.enumeration.BookingType;
import org.assertj.core.util.Lists;

import java.time.Instant;
import java.util.List;

public class BookingTestData {

  public final static Long id = 1L;
  public final static Long version = 2L;
  public final static String name = "b name";
  public final static String bookingToken = "b token";
  public final static String comment = "b comment";
  public final static Instant bookingDate = Instant.parse("2018-11-30T18:35:24.00Z");
  public final static Instant expirationDate = Instant.parse("2018-12-30T18:35:24.00Z");
  public final static Instant creationDate = Instant.parse("2018-10-30T18:35:24.00Z");
  public final static String email = "email@booking.com";
  public final static Boolean canceled = false;
  public final static BookingType bookingType = BookingType.COMMON;
  public final static BookingTable bookingTableWithId = BookingTableTestData.withId();
  public final static BookingTable bookingTableWithoutId = BookingTableTestData.withoutId();
  public final static Long userId = 3L;
  public final static List<InvitedGuest> invitedGuestsWithId = Lists.list(
      InvitedGuestTestData.withId(4L, 1L),
      InvitedGuestTestData.withId(5L, 2L)
  );
  public final static List<InvitedGuest> invitedGuestsWithoutId = Lists.list(
      InvitedGuestTestData.withoutId("a token one"),
      InvitedGuestTestData.withoutId("a token two")
  );
  public final static Integer assistants = 4;

  public static Booking withoutId() {
    return withoutId(name);
  }

  public static Booking withoutId(String name) {
    return Booking.withoutId(name,
        bookingToken,
        comment,
        bookingDate,
        expirationDate,
        creationDate,
        email,
        canceled,
        bookingType,
        bookingTableWithoutId,
        userId,
        invitedGuestsWithoutId,
        assistants);
  }

  public static Booking withId() {
    return withId(id, version);
  }

  public static Booking withId(Long id, Long version) {
    return Booking.withId(id,
        version,
        name,
        bookingToken,
        comment,
        bookingDate,
        expirationDate,
        creationDate,
        email,
        canceled,
        bookingType,
        bookingTableWithId,
        userId,
        invitedGuestsWithId,
        assistants);
  }

}
