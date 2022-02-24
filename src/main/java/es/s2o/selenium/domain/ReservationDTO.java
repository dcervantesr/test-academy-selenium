package es.s2o.selenium.domain;


/**
 * Created by sacrists on 26.02.17.
 */
public class ReservationDTO {

    private String origin;
    private String destination;
    private String date;

    public ReservationDTO() {

    }

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

    public String getDate() {
        return date;
    }
    public void setDate(String date) { this.date = date; }

    @Override
    public String toString() {
        return "ReservationDTO{" +
                "name='" + origin + '\'' +
                ", phone='" + destination + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
