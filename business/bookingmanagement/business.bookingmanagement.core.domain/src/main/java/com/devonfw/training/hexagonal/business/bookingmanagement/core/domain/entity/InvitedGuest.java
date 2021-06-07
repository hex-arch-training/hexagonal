package com.devonfw.training.hexagonal.business.bookingmanagement.core.domain.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class InvitedGuest {

  private Long id;

  private Long version;

  private String guestToken;

  private String email;

  private Boolean accepted;

  public static InvitedGuest withoutId(String guestToken,
                                       String email,
                                       Boolean accepted) {
    return new InvitedGuest(null, null, guestToken, email, accepted);
  }

  public static InvitedGuest withId(Long id,
                                    Long version,
                                    String guestToken,
                                    String email,
                                    Boolean accepted) {
    return new InvitedGuest(id, version, guestToken, email, accepted);
  }
}
