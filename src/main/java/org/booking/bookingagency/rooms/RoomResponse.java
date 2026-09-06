package org.booking.bookingagency.rooms;

import java.math.BigDecimal;

public record RoomResponse(Long id,
                           String number,
                           Long hotelId,
                           Integer capacity,
                           BigDecimal price,
                           RoomType type) {
}
