package com.devonfw.training.hexagonal.business.bookingmanagement.core.domain.test.testdata;

import com.devonfw.training.hexagonal.business.bookingmanagement.core.domain.entity.BookingTable;

public class BookingTableTestData {

  public final static Long id = 1L;
  public final static Long version = 2L;
  public final static Integer seatsNumber = 3;


  public static BookingTable withoutId() {
    return withoutId(seatsNumber);
  }

  public static BookingTable withoutId(Integer seatsNumber) {
    return BookingTable.withoutId(seatsNumber);
  }

  public static BookingTable withId() {
    return withId(id, version);
  }

  public static BookingTable withId(Long id, Long version) {
    return BookingTable.withId(id, version, seatsNumber);
  }

}
