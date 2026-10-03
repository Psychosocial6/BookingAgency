package org.booking.bookingagency.hotels;

import lombok.RequiredArgsConstructor;
import org.booking.bookingagency.exceptions.custom.HotelNotFoundException;
import org.booking.bookingagency.hotels.dto.HotelRequest;
import org.booking.bookingagency.hotels.dto.HotelResponse;
import org.booking.bookingagency.util.HotelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class HotelService {
    private final HotelMapper hotelMapper;
    private final HotelRepository hotelRepository;

    public List<HotelResponse> getHotels(String country, String city) {
        return hotelRepository.findAllByCountryAndCity(country, city)
                .stream()
                .map(hotelMapper::fromEntity)
                .toList();
    }

    public HotelResponse getHotelById(Long id) {
        return hotelMapper.fromEntity(
                hotelRepository.findById(id)
                .orElseThrow(() -> new HotelNotFoundException(id))
        );
    }

    @Transactional
    public HotelResponse createHotel(HotelRequest hotelRequest) {
        HotelEntity hotelEntity = new HotelEntity(
                hotelRequest.country(),
                hotelRequest.city(),
                hotelRequest.name(),
                hotelRequest.address(),
                hotelRequest.phoneNumber()
        );

        return hotelMapper.fromEntity(hotelRepository.save(hotelEntity));
    }

    @Transactional
    public HotelResponse updateHotel(HotelRequest hotelRequest, Long id) {
        HotelEntity hotelEntity = hotelRepository.findById(id)
                .orElseThrow(() -> new HotelNotFoundException(id));

        hotelEntity.setCountry(hotelRequest.country());
        hotelEntity.setCity(hotelRequest.city());
        hotelEntity.setName(hotelRequest.name());
        hotelEntity.setAddress(hotelRequest.address());
        hotelEntity.setPhoneNumber(hotelRequest.phoneNumber());

        return hotelMapper.fromEntity(hotelRepository.save(hotelEntity));
    }

    @Transactional
    public void deleteHotel(Long id) {
        hotelRepository.deleteById(id);
    }
}
