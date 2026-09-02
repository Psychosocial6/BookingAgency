package hotels;

public record HotelResponse(long id,
                            String country,
                            String city,
                            String name,
                            String address,
                            String phoneNumber) {
}

