package org.booking.bookingagency.exceptions;

import java.time.LocalDateTime;

public record ExceptionResponse(Integer code, String message, LocalDateTime timestamp) {
}
