package com.devonfw.training.hexagonal.business.bookingmanagement.adapter.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "ta_table_booking")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingTableJpaEntity {

  @Id
  @GeneratedValue
  private Long id;

  @Version
  private Long version;

  @Column(name = "seats_number")
  private Integer seatsNumber;

  @OneToOne
  @JoinColumn(name = "booking_id", referencedColumnName = "id")
  private BookingJpaEntity booking;
}
