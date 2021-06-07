package com.devonfw.training.hexagonal.business.bookingmanagement.core.domain.test.testdata;

import com.devonfw.training.hexagonal.business.bookingmanagement.core.domain.entity.InvitedGuest;

public class InvitedGuestTestData {

  public final static Long id = 1L;
  public final static Long version = 2L;
  public final static String guestToken = "a token";
  public final static String email = "invited@guest.com";
  public final static Boolean accepted = true;

  public static InvitedGuest withoutId() {
    return withoutId(guestToken);
  }

  public static InvitedGuest withoutId(String guestToken) {
    return InvitedGuest.withoutId(guestToken, email, accepted);
  }

  public static InvitedGuest withId() {
    return withId(id, version);
  }

  public static InvitedGuest withId(Long id, Long version) {
    return InvitedGuest.withId(id, version, guestToken, email, accepted);
  }

}
