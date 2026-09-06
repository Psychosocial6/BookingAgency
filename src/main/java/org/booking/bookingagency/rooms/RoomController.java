package org.booking.bookingagency.rooms;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
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
@RequestMapping("/api/rooms")
@RestController
public class RoomController {
    private final RoomService roomService;

    @GetMapping
    public ResponseEntity<List<RoomResponse>> getRooms(
            @Positive(message = "Hotel ID must be a positive number")
            @RequestParam(required = false)
            Long hotelId) {
        log.info("getRooms called: hotelId={}", hotelId);
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<RoomResponse> getRoomById(
            @NotNull(message = "Room ID required")
            @Positive(message = "Room ID must be a positive number")
            @PathVariable Long id) {
        log.info("getRoomById called: id={}", id);
        return null;
    }

    @PostMapping
    public ResponseEntity<RoomResponse> createRoom(
            @Valid @RequestBody RoomRequest roomRequest) {
        log.info("createRoom called: roomRequest={}", roomRequest);
        return null;
    }

    @PatchMapping("/{id}")
    public ResponseEntity<RoomResponse> updateRoom(
            @Valid @RequestBody RoomRequest roomRequest,

            @NotNull(message = "Room ID required")
            @Positive(message = "Room ID must be a positive number")
            @PathVariable Long id) {
        log.info("updateRoom called: id={}, roomRequest={}", id, roomRequest);
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRoom(
            @NotNull(message = "Room ID required")
            @Positive(message = "Room ID must be a positive number")
            @PathVariable Long id) {
        log.info("deleteRoom called: id={}", id);
        return null;
    }
}
