package com.devonfw.training.hexagonal.business.bookingmanagement.adapter.persistence.mapper;

import com.devonfw.training.hexagonal.business.bookingmanagement.adapter.persistence.entity.BookingJpaEntity;
import com.devonfw.training.hexagonal.business.bookingmanagement.core.domain.entity.Booking;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface BookingManagementPersistenceMapper {

  BookingJpaEntity map(Booking booking);

  Booking map(BookingJpaEntity booking);

  List<Booking> map(List<BookingJpaEntity> booking);
}
