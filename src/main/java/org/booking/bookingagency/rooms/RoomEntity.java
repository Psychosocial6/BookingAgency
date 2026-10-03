package org.booking.bookingagency.rooms;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.booking.bookingagency.hotels.HotelEntity;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "rooms")
public class RoomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "number", nullable = false)
    String number;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "hotel_id", nullable = false)
    HotelEntity hotel;
    @Column(name = "capacity", nullable = false)
    Integer capacity;
    @Column(name = "price", nullable = false)
    BigDecimal price;
    @Column(name = "room_type", nullable = false)
    @Enumerated(EnumType.STRING)
    RoomType roomType;

    public RoomEntity(String number,
                      HotelEntity hotel,
                      Integer capacity,
                      BigDecimal price,
                      RoomType roomType) {
        this.number = number;
        this.hotel = hotel;
        this.capacity = capacity;
        this.price = price;
        this.roomType = roomType;
    }
}
