package rooms;

import java.math.BigDecimal;

public record RoomRequest(String number,
                          Long hotelId,
                          Integer capacity,
                          BigDecimal price,
                          RoomType type) {
}
