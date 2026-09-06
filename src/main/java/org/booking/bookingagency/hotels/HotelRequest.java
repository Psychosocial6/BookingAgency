package org.booking.bookingagency.hotels;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record HotelRequest(
        @NotBlank(message = "Country is required")
        String country,

        @NotBlank(message = "City is required")
        String city,

        @NotBlank(message = "Name is required")
        String name,

        @NotBlank(message = "Address is required")
        String address,

        @NotBlank(message = "Phone number is required")
        @Pattern(
                regexp = "^\\+?[1-9]\\d{7,14}$",
                message = "Phone number must be valid international format"
        )
        String phoneNumber) {
}
