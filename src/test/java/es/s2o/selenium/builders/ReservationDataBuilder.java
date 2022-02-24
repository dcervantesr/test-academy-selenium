package es.s2o.selenium.builders;

import java.time.LocalDate;
import java.time.LocalTime;

public class ReservationDataBuilder {

    public static ReservationBuilder defaultReservation(Integer id) {
        return ReservationBuilder
                .aReservation()
                .withId(id)
                .withDate(LocalDate.now().plusDays(1))
                .withDestination("")
                .withOrigin("");
    }
}
