package com.devonfw.training.hexagonal.business.bookingmanagement.core.domain.enumeration;

public enum BookingType {

  COMMON, INVITED;

  public boolean isCommon() {

    return (this == COMMON);
  }

  public boolean isInvited() {

    return (this == INVITED);
  }

}