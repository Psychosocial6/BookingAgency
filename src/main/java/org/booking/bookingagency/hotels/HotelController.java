package org.booking.bookingagency.hotels;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/hotels")
public class HotelController {
    private final HotelService hotelService;

    @GetMapping
    public ResponseEntity<List<HotelResponse>> getHotels(
            @Pattern(
                    regexp = "^[a-zA-Zа-яА-ЯёЁ\\s-]+$",
                    message = "Country must contain only letters"
            )
            @RequestParam(required = false)
            String country,

            @Pattern(
                    regexp = "^[a-zA-Zа-яА-ЯёЁ\\s-]+$",
                    message = "City must contain only letters"
            )
            @RequestParam(required = false)
            String city) {
        log.info("getHotels called: country={}, city={}", country, city);
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<HotelResponse> getHotelById(
            @Positive(message = "Hotel ID must be a positive number")
            @PathVariable Long id) {
        log.info("getHotelById called: id={}", id);
        return null;
    }

    @PostMapping
    public ResponseEntity<HotelResponse> createHotel(
            @Valid @RequestBody HotelRequest hotelRequest) {
        log.info("createHotel called: hotelRequest={}", hotelRequest);
        return null;
    }

    @PatchMapping("/{id}")
    public ResponseEntity<HotelResponse> updateHotel(
            @Valid @RequestBody HotelRequest hotelRequest,

            @Positive(message = "Hotel ID must be a positive number")
            @PathVariable Long id) {
        log.info("updateHotel called: id={}, hotelRequest={}", id, hotelRequest);
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHotel(
            @Positive(message = "Hotel ID must be a positive number")
            @PathVariable Long id) {
        log.info("deleteHotel called: id={}", id);
        return null;
    }
}
