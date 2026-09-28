package org.booking.bookingagency.exceptions;

public class RoomNotFoundException extends NotFoundException {
    public RoomNotFoundException(Long id) {
        super(String.format("Room with id %d not found", id));
    }
}
