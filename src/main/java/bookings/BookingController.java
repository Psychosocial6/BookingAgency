package bookings;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/bookings")
@RestController
public class BookingController {
    private final BookingService bookingService;

    @GetMapping
    public ResponseEntity<List<BookingResponse>> getBookings(@RequestParam(required = false) Long userId,
                                                             @RequestParam(required = false) Long hotelId) {
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookingResponse> getBookingById(@PathVariable Long id) {
        return null;
    }

    @PostMapping
    public ResponseEntity<BookingResponse> createBooking(@RequestBody BookingRequest bookingRequest) {
        return null;
    }

    @PatchMapping("/{id}")
    public ResponseEntity<BookingResponse> updateBooking(@RequestBody BookingRequest bookingRequest,
                                                         @PathVariable Long id) {
        return null;
    }

    @PatchMapping("/{id}/confirm")
    public ResponseEntity<BookingResponse> confirmBooking(@PathVariable Long id) {
        return null;
    }

    @PatchMapping("/{id}/cancel")
    public ResponseEntity<BookingResponse> cancelBooking(@PathVariable Long id) {
        return null;
    }

    @PatchMapping("/{id}/check-in")
    public ResponseEntity<BookingResponse> checkInBooking(@PathVariable Long id) {
        return null;
    }

    @PatchMapping("/{id}/check-out")
    public ResponseEntity<BookingResponse> checkOutBooking(@PathVariable Long id) {
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBooking(@PathVariable Long id) {
        return null;
    }
}
