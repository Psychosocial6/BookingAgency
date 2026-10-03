package org.booking.bookingagency.exceptions.custom;

public class HotelNotFoundException extends NotFoundException {
    public HotelNotFoundException(Long id) {
        super(String.format("Hotel with id %d not found", id));
    }
}
