package com.devonfw.training.hexagonal.business.ordermanagement.adapter.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;
import java.util.List;

@Entity
@Table(name = "ta_order")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderJpaEntity {

  @Id
  @GeneratedValue
  private Long id;

  @Version
  private Long version;

  @Column(name = "booking_id")
  private Long bookingId;

  @Column(name = "host_name")
  private String hostName;

  @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
  private List<OrderLineJpaEntity> orderLines;

}
