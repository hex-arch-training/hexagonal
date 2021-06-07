package com.devonfw.training.hexagonal.business.bookingmanagement.core.domain.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class BookingTable {

  private Long id;

  private Long version;

  private Integer seatsNumber;

  public static BookingTable withoutId(Integer seatsNumber) {
    return new BookingTable(null, null, seatsNumber);
  }

  public static BookingTable withId(Long id,
                                    Long version,
                                    Integer seatsNumber) {
    return new BookingTable(id, version, seatsNumber);
  }
}
