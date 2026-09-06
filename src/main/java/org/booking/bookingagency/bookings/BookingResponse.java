package org.booking.bookingagency.bookings;

import java.time.LocalDateTime;

public record BookingResponse(Long id,
                              Long userId,
                              Long roomId,
                              LocalDateTime startDate,
                              LocalDateTime endDate,
                              BookingStatus status) {
}
