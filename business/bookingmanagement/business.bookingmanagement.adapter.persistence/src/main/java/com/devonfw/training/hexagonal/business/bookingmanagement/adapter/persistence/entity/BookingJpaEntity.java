package com.devonfw.training.hexagonal.business.bookingmanagement.adapter.persistence.entity;

import com.devonfw.training.hexagonal.business.bookingmanagement.core.domain.enumeration.BookingType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;
import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "ta_booking")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingJpaEntity {

  @Id
  @GeneratedValue
  private Long id;

  @Version
  private Long version;

  @Column
  private String name;

  @Column(name = "booking_token")
  private String bookingToken;

  @Column
  private String comment;

  @Column(name = "booking_date")
  private Instant bookingDate;

  @Column(name = "expiration_date")
  private Instant expirationDate;

  @Column(name = "creation_date")
  private Instant creationDate;

  @Column
  private String email;

  @Column
  private Boolean canceled;

  @Column(name = "booking_type")
  private BookingType bookingType;

  @OneToOne(mappedBy = "booking", cascade = CascadeType.ALL)
  private BookingTableJpaEntity bookingTable;

  @Column(name = "user_name")
  private String userName;


  @OneToMany(mappedBy = "booking", cascade = CascadeType.ALL)
  private List<InvitedGuestJpaEntity> invitedGuests;

  @Column
  private Integer assistants;

}
