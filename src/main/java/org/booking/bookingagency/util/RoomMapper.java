package org.booking.bookingagency.util;

import org.booking.bookingagency.rooms.RoomEntity;
import org.booking.bookingagency.rooms.dto.RoomResponse;
import org.springframework.stereotype.Component;

@Component
public class RoomMapper {
    public RoomResponse fromEntity(RoomEntity roomEntity) {
        return new RoomResponse(
                roomEntity.getId(),
                roomEntity.getNumber(),
                roomEntity.getHotel().getId(),
                roomEntity.getCapacity(),
                roomEntity.getPrice(),
                roomEntity.getRoomType()
        );
    }
}
