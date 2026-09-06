package org.booking.bookingagency.rooms;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

public record RoomRequest(
        @Pattern(
                regexp = "^[a-zA-Z0-9-]{1,10}$",
                message = "Room number must be 1-10 characters long and contain only letters, numbers, and hyphens"
        )
        String number,

        @NotNull(message = "Hotel ID is required")
        @Positive(message = "Hotel ID must be a positive number")
        Long hotelId,

        @NotNull(message = "Room capacity is required")
        @Positive(message = "Room capacity must be a positive number")
        Integer capacity,

        @NotNull(message = "Room price is required")
        @Positive(message = "Room price must be a positive number")
        BigDecimal price,

        @NotNull(message = "Room type is required")
        RoomType type) {
}
