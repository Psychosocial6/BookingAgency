package org.booking.bookingagency.hotels.dto;

public record HotelResponse(long id,
                            String country,
                            String city,
                            String name,
                            String address,
                            String phoneNumber) {
}

