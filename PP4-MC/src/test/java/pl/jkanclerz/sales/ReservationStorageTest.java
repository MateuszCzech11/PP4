package pl.jkanclerz.sales;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class ReservationStorageTest {

    @Test
    void insert(){
        Reservation reservation = new Reservation("res-1234d",
                BigDecimal.valueOf(10.10),
                "Payu/12345"
                );
    }


}
