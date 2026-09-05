package rooms;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/rooms")
@RestController
public class RoomController {
    private final RoomService roomService;

    @GetMapping
    public ResponseEntity<List<RoomResponse>> getRooms(@RequestParam(required = false) Long hotelId) {
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<RoomResponse> getRoomById(@PathVariable Long id) {
        return null;
    }

    @PostMapping
    public ResponseEntity<RoomResponse> createRoom(@RequestBody RoomRequest roomRequest) {
        return null;
    }

    @PatchMapping("/{id}")
    public ResponseEntity<RoomResponse> updateRoom(@RequestBody RoomRequest roomRequest,
                                                   @PathVariable Long id) {
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRoom(@PathVariable Long id) {
        return null;
    }
}
