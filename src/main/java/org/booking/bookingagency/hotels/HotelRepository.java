package org.booking.bookingagency.hotels;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HotelRepository extends JpaRepository<HotelEntity, Long> {
    List<HotelEntity> findAllByCountryAndCity(String country, String city);
}
