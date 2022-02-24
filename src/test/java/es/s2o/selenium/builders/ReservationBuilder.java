package es.s2o.selenium.builders;

import es.s2o.selenium.domain.Reservation;

import java.time.LocalDate;
import java.time.LocalTime;

public final class ReservationBuilder {
    private Integer id;
    private String origin;
    private String destination;
    private LocalDate date;

    private ReservationBuilder() {
    }

    public static ReservationBuilder aReservation() {
        return new ReservationBuilder();
    }

    public ReservationBuilder withId(Integer id) {
        this.id = id;
        return this;
    }

    public ReservationBuilder withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    public ReservationBuilder withDestination(String destination) {
        this.destination = destination;
        return this;
    }

    public ReservationBuilder withDate(LocalDate date) {
        this.date = date;
        return this;
    }

    public Reservation build() {
        Reservation reservation = new Reservation();
        reservation.setId(id);
        reservation.setOrigin(origin);
        reservation.setDestination(destination);
        reservation.setDate(date);
        return reservation;
    }
}
