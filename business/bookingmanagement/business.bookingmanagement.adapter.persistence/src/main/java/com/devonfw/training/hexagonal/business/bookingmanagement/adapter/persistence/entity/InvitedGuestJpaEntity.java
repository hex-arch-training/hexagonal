package com.devonfw.training.hexagonal.business.bookingmanagement.adapter.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "ta_invited_guest")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InvitedGuestJpaEntity {

  @Id
  @GeneratedValue
  private Long id;

  @Version
  private Long version;

  @Column(name = "guest_token")
  private String guestToken;

  @Column
  private String email;

  @Column
  private Boolean accepted;

  @ManyToOne
  @JoinColumn(name = "booking_id")
  private BookingJpaEntity booking;
}
