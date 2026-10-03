package org.booking.bookingagency.util;

import org.booking.bookingagency.hotels.HotelEntity;
import org.booking.bookingagency.hotels.dto.HotelResponse;
import org.springframework.stereotype.Component;

@Component
public class HotelMapper {
    public HotelResponse fromEntity(HotelEntity hotelEntity) {
        return new HotelResponse(
                hotelEntity.getId(),
                hotelEntity.getCountry(),
                hotelEntity.getCity(),
                hotelEntity.getName(),
                hotelEntity.getAddress(),
                hotelEntity.getPhoneNumber()
        );
    }
}
