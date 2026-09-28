package org.booking.bookingagency.rooms;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.booking.bookingagency.exceptions.RoomNotFoundException;
import org.booking.bookingagency.rooms.dto.RoomRequest;
import org.booking.bookingagency.rooms.dto.RoomResponse;
import org.booking.bookingagency.util.RoomMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class RoomService {
    private final RoomRepository roomRepository;
    private final RoomMapper roomMapper;

    public List<RoomResponse> getRooms(Long hotelId) {
        return roomRepository.findAllByHotelId(hotelId)
                .stream()
                .map(roomMapper::fromEntity)
                .toList();
    }

    @Transactional
    public RoomResponse createRoom(RoomRequest roomRequest) {
        RoomEntity roomEntity = new RoomEntity(
                //TODO: get hotel by id
                /*
                roomRequest.number(),
                roomRequest.hotelId(),
                roomRequest.capacity(),
                roomRequest.price(),
                roomRequest.type()
                 */
        );
        return roomMapper.fromEntity(roomRepository.save(roomEntity));
    }

    public RoomResponse getRoomById(Long id) {
        return roomMapper.fromEntity(
                roomRepository.findById(id).orElseThrow(() -> new RoomNotFoundException(id))
        );
    }

    @Transactional
    public RoomResponse updateRoom(Long id, RoomRequest roomRequest) {
        RoomEntity roomEntity = roomRepository.findById(id).orElseThrow(() -> new RoomNotFoundException(id));
        roomEntity.setNumber(roomRequest.number());
        //TODO: get hotel entity
        //roomEntity.setHotel();
        roomEntity.setCapacity(roomRequest.capacity());
        roomEntity.setPrice(roomRequest.price());
        roomEntity.setRoomType(roomRequest.type());

        return roomMapper.fromEntity(roomRepository.save(roomEntity));
    }

    public void deleteRoom(Long id) {
        roomRepository.deleteById(id);
    }
}
