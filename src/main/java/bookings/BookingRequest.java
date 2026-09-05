package bookings;

import jakarta.validation.constraints.*;

import java.time.LocalDateTime;

public record BookingRequest(
        @NotNull(message = "User ID is required")
        @Positive(message = "User ID must be a positive number")
        Long userId,

        @NotNull(message = "Room ID is required")
        @Positive(message = "Room ID must be a positive number")
        Long roomId,

        @NotNull(message = "Start date is required")
        @FutureOrPresent(message = "Start date can not be in the past")
        LocalDateTime startDate,

        @NotNull(message = "End date is required")
        @FutureOrPresent(message = "End date can not be in the past")
        LocalDateTime endDate) {

    @AssertTrue
    public  boolean isStartBeforeEnd() {
        if (startDate == null || endDate == null) {
            return true;
        }
        return startDate.isBefore(endDate);
    }
}
