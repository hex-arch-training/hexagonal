package com.devonfw.training.hexagonal.business.bookingmanagement.core.logic.usecase;


import com.devonfw.training.hexagonal.business.bookingmanagement.core.boundary.provided.usecase.SaveBookingUseCasePort;
import com.devonfw.training.hexagonal.business.bookingmanagement.core.boundary.required.persistence.SaveBookingPersistencePort;
import com.devonfw.training.hexagonal.business.bookingmanagement.core.domain.entity.Booking;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SaveBookingUseCase implements SaveBookingUseCasePort {

  private final SaveBookingPersistencePort saveBookingPersistencePort;

  @Override
  public Booking saveBooking(Booking booking) {
    Booking validatedBooking = getValidatedBooking(null, booking);

    Booking savedBooking = saveBookingPersistencePort.save(validatedBooking);

    sendBookingConfirmationEmail(null, savedBooking);

    return savedBooking;
  }


  private Booking getValidatedBooking(String token, Booking booking) {

//    // BOOKING VALIDATION
//    if (getBookingType(token) == BookingType.COMMON) {
//      BookingCto booking = getBookingbyToken(token);
//      if (booking == null) {
//        throw new NoBookingException();
//      }
//      List<BookingCto> currentBookings = getBookingBookings(booking.getBooking().getId());
//      if (!currentBookings.isEmpty()) {
//        throw new BookingAlreadyExistException();
//      }
//      bookingEntity.setBookingId(booking.getBooking().getId());
//
//      // GUEST VALIDATION
//    } else if (getBookingType(token) == BookingType.INVITED) {
//
//      InvitedGuestEto guest = getInvitedGuestByToken(token);
//      if (guest == null) {
//        throw new NoInviteException();
//      }
//      List<BookingCto> currentGuestBookings = getInvitedGuestBookings(guest.getId());
//      if (!currentGuestBookings.isEmpty()) {
//        throw new BookingAlreadyExistException();
//      }
//      bookingEntity.setBookingId(guest.getBookingId());
//      bookingEntity.setInvitedGuestId(guest.getId());
//    }
//
//    return bookingEntity;
    return booking;

  }

  private void sendBookingConfirmationEmail(String token, Booking booking) {
//
//    Objects.requireNonNull(token, "token");
//    Objects.requireNonNull(booking, "booking");
//    try {
//      String emailTo = getBookingOrGuestEmail(token);
//      StringBuilder mailContent = new StringBuilder();
//
//      mailContent.append("MY THAI STAR").append("\n");
//      mailContent.append("Hi ").append(emailTo).append("\n");
//      mailContent.append("Your booking has been created.").append("\n");
//      mailContent.append(getContentFormatedWithCost(booking)).append("\n");
//      mailContent.append("\n").append("Link to cancel booking: ");
//      String link = "http://localhost:" + this.clientPort + "/booking/cancelBooking/" + booking.getId();
//      mailContent.append(link);
//      this.mailService.sendMail(emailTo, "Booking confirmation", mailContent.toString());
//    } catch (Exception e) {
//      LOG.error("Email not sent. {}", e.getMessage());
//    }
  }
}
