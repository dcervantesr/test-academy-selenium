package es.s2o.selenium.domain;


import java.time.LocalDate;
import java.time.LocalTime;

public class Reservation {
    private Integer id;
    private String origin;
    private String destination;
    private LocalDate date;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getOrigin() {
        return origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ReservationDTO{" +
                "origin=" + origin +
                ", destination=" + destination +
                ", date=" + date + '\'' +
                '}';
    }
}
