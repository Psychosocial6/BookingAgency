package org.booking.bookingagency.rooms;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RequiredArgsConstructor
@RequestMapping("/api/rooms")
@RestController
public class RoomController {
    private final RoomService roomService;

    @GetMapping
    public ResponseEntity<List<RoomResponse>> getRooms(
            @Positive(message = "Hotel ID must be a positive number")
            @RequestParam(required = false)
            Long hotelId) {
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<RoomResponse> getRoomById(
            @NotNull(message = "Room ID required")
            @Positive(message = "Room ID must be a positive number")
            @PathVariable
            Long id) {
        return null;
    }

    @PostMapping
    public ResponseEntity<RoomResponse> createRoom(
            @Valid
            @RequestBody
            RoomRequest roomRequest) {
        return null;
    }

    @PatchMapping("/{id}")
    public ResponseEntity<RoomResponse> updateRoom(
            @Valid
            @RequestBody
            RoomRequest roomRequest,

            @NotNull(message = "Room ID required")
            @Positive(message = "Room ID must be a positive number")
            @PathVariable
            Long id) {
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRoom(
            @NotNull(message = "Room ID required")
            @Positive(message = "Room ID must be a positive number")
            @PathVariable
            Long id) {
        return null;
    }
}
