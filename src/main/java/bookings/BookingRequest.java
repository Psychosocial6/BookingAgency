package bookings;

import java.time.LocalDateTime;

public record BookingRequest(Long userId,
                             Long roomId,
                             LocalDateTime startDate,
                             LocalDateTime endDate) {
}
