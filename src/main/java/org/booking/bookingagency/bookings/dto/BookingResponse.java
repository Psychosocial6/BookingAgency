package org.booking.bookingagency.bookings.dto;

import org.booking.bookingagency.bookings.BookingStatus;

import java.time.LocalDateTime;

public record BookingResponse(Long id,
                              Long userId,
                              Long roomId,
                              LocalDateTime startDate,
                              LocalDateTime endDate,
                              BookingStatus status) {
}
