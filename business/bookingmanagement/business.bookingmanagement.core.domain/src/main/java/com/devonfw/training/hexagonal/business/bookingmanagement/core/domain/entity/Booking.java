package com.devonfw.training.hexagonal.business.bookingmanagement.core.domain.entity;

import com.devonfw.training.hexagonal.business.bookingmanagement.core.domain.enumeration.BookingType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Booking {

  private Long id;

  private Long version;

  private String name;

  private String bookingToken;

  private String comment;

  private Instant bookingDate;

  private Instant expirationDate;

  private Instant creationDate;

  private String email;

  private Boolean canceled;

  private BookingType bookingType;

  private BookingTable bookingTable;

  private String userName;

  private List<InvitedGuest> invitedGuests;

  private Integer assistants;

  public static Booking withoutId(String name,
                                  String bookingToken,
                                  String comment,
                                  Instant bookingDate,
                                  Instant expirationDate,
                                  Instant creationDate,
                                  String email,
                                  Boolean canceled,
                                  BookingType bookingType,
                                  BookingTable bookingTable,
                                  String userName,
                                  List<InvitedGuest> invitedGuests,
                                  Integer assistants) {
    return new Booking(null,
        null,
        name,
        bookingToken,
        comment,
        bookingDate,
        expirationDate,
        creationDate,
        email,
        canceled,
        bookingType,
        bookingTable,
        userName,
        invitedGuests,
        assistants);

  }

  public static Booking withId(Long id,
                               Long version,
                               String name,
                               String bookingToken,
                               String comment,
                               Instant bookingDate,
                               Instant expirationDate,
                               Instant creationDate,
                               String email,
                               Boolean canceled,
                               BookingType bookingType,
                               BookingTable bookingTable,
                               String userName,
                               List<InvitedGuest> invitedGuests,
                               Integer assistants) {
    return new Booking(id,
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
        bookingTable,
        userName,
        invitedGuests,
        assistants);
  }
}
