package com.devonfw.training.hexagonal.business.bookingmanagement.adapter.persistence.mapper;

import com.devonfw.training.hexagonal.business.bookingmanagement.adapter.persistence.entity.BookingJpaEntity;
import com.devonfw.training.hexagonal.business.bookingmanagement.adapter.persistence.entity.BookingTableJpaEntity;
import com.devonfw.training.hexagonal.business.bookingmanagement.adapter.persistence.entity.InvitedGuestJpaEntity;
import com.devonfw.training.hexagonal.business.bookingmanagement.core.domain.entity.Booking;
import com.devonfw.training.hexagonal.business.bookingmanagement.core.domain.entity.BookingTable;
import com.devonfw.training.hexagonal.business.bookingmanagement.core.domain.entity.InvitedGuest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface BookingManagementPersistenceMapper {

  BookingJpaEntity map(Booking booking);

  @Mapping(target = "booking", ignore = true)
  BookingTableJpaEntity map(BookingTable bookingTable);

  @Mapping(target = "booking", ignore = true)
  InvitedGuestJpaEntity map(InvitedGuest invitedGuest);

  Booking map(BookingJpaEntity booking);

  List<Booking> map(List<BookingJpaEntity> booking);
}
