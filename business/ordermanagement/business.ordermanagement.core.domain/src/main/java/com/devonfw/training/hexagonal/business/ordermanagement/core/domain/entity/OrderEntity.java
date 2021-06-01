//package com.devonfw.training.hexagonal.business.ordermanagement.core.domain.entity;
//
//public class Order {
//
//  private static final long serialVersionUID = 1L;
//
//  private BookingEntity booking;
//
//  private InvitedGuestEntity invitedGuest;
//
//  private BookingEntity host;
//
//  private List<OrderLineEntity> orderLines;
//
//  public BookingEntity getBooking() {
//
//    return this.booking;
//  }
//
//  public void setBooking(BookingEntity booking) {
//
//    this.booking = booking;
//  }
//
//  public InvitedGuestEntity getInvitedGuest() {
//
//    return this.invitedGuest;
//  }
//
//  public void setInvitedGuest(InvitedGuestEntity invitedGuest) {
//
//    this.invitedGuest = invitedGuest;
//  }
//
//  public List<OrderLineEntity> getOrderLines() {
//
//    return this.orderLines;
//  }
//
//  public void setOrderLines(List<OrderLineEntity> orderLines) {
//
//    this.orderLines = orderLines;
//  }
//
//  public Long getBookingId() {
//
//    if (this.booking == null) {
//      return null;
//    }
//    return this.booking.getId();
//  }
//
//  public void setBookingId(Long bookingId) {
//
//    if (bookingId == null) {
//      this.booking = null;
//    } else {
//      BookingEntity bookingEntity = new BookingEntity();
//      bookingEntity.setId(bookingId);
//      this.booking = bookingEntity;
//    }
//  }
//
//  public Long getInvitedGuestId() {
//
//    if (this.invitedGuest == null) {
//      return null;
//    }
//    return this.invitedGuest.getId();
//  }
//
//  public void setInvitedGuestId(Long invitedGuestId) {
//
//    if (invitedGuestId == null) {
//      this.invitedGuest = null;
//    } else {
//      InvitedGuestEntity invitedGuestEntity = new InvitedGuestEntity();
//      invitedGuestEntity.setId(invitedGuestId);
//      this.invitedGuest = invitedGuestEntity;
//    }
//  }
//
//  public BookingEntity getHost() {
//
//    return this.host;
//  }
//
//  public void setHost(BookingEntity host) {
//
//    this.host = host;
//  }
//
//  public Long getHostId() {
//
//    if (this.host == null) {
//      return null;
//    }
//    return this.host.getId();
//  }
//
//  public void setHostId(Long hostId) {
//
//    if (hostId == null) {
//      this.host = null;
//    } else {
//      BookingEntity bookingEntity = new BookingEntity();
//      bookingEntity.setId(hostId);
//      this.host = bookingEntity;
//    }
//  }
//
//}
