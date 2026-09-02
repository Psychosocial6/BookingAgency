package hotels;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/hotels")
public class HotelController {
    private final HotelService hotelService;

    @GetMapping
    public ResponseEntity<List<HotelResponse>> getHotels(@RequestParam(required = false) String country,
                                                         @RequestParam(required = false) String city) {
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<HotelResponse> getHotelById(@PathVariable Long id) {
        return null;
    }

    @PostMapping
    public ResponseEntity<HotelResponse> createHotel(@RequestBody HotelRequest hotelRequest) {
        return null;
    }

    @PatchMapping("/{id}")
    public ResponseEntity<HotelResponse> updateHotel(@RequestBody HotelRequest hotelRequest,
                                                     @PathVariable long id) {
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHotel(@PathVariable Long id) {
        return null;
    }
}
