package org.booking.bookingagency.bookings;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RequiredArgsConstructor
@RequestMapping("/api/bookings")
@RestController
public class BookingController {
    private final BookingService bookingService;

    @GetMapping
    public ResponseEntity<List<BookingResponse>> getBookings(
            @Positive(message = "User ID must be a positive number")
            @RequestParam(required = false)
            Long userId,

            @Positive(message = "Hotel ID must be a positive number")
            @RequestParam(required = false)
            Long hotelId) {
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookingResponse> getBookingById(
            @Positive(message = "Booking ID must be a positive number")
            @PathVariable Long id) {
        return null;
    }

    @PostMapping
    public ResponseEntity<BookingResponse> createBooking(
            @Valid @RequestBody BookingRequest bookingRequest) {
        return null;
    }

    @PatchMapping("/{id}")
    public ResponseEntity<BookingResponse> updateBooking(
            @Valid @RequestBody BookingRequest bookingRequest,

            @Positive(message = "Booking ID must be a positive number")
            @PathVariable Long id) {
        return null;
    }

    @PatchMapping("/{id}/confirm")
    public ResponseEntity<BookingResponse> confirmBooking(
            @Positive(message = "Booking ID must be a positive number")
            @PathVariable Long id) {
        return null;
    }

    @PatchMapping("/{id}/cancel")
    public ResponseEntity<BookingResponse> cancelBooking(
            @Positive(message = "Booking ID must be a positive number")
            @PathVariable Long id) {
        return null;
    }

    @PatchMapping("/{id}/check-in")
    public ResponseEntity<BookingResponse> checkInBooking(
            @Positive(message = "Booking ID must be a positive number")
            @PathVariable Long id) {
        return null;
    }

    @PatchMapping("/{id}/check-out")
    public ResponseEntity<BookingResponse> checkOutBooking(
            @Positive(message = "Booking ID must be a positive number")
            @PathVariable Long id) {
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBooking(
            @Positive(message = "Booking ID must be a positive number")
            @PathVariable Long id) {
        return null;
    }
}
