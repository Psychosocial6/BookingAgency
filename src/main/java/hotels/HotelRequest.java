package hotels;

public record HotelRequest(String country,
                           String city,
                           String name,
                           String address,
                           String phoneNumber) {
}
