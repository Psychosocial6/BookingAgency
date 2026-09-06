package org.booking.bookingagency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class BookingAgencyApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookingAgencyApplication.class, args);
    }

}
