package FLY_SYSTEM;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Flight {
    private String number;   // Номер рейсу
    private Seat seats[];    // места
    private Airport from;    // откуда
    private Airport to;      // куда
    private LocalDateTime depatrureTime;   // время вилета
    private LocalDateTime arivelTime;      // время прибытия


    public Flight(String number, Airport from, Airport to, LocalDateTime depatrureTime, LocalDateTime arivelTime) {
        this.number = number;
        this.from = from;
        this.to = to;
        this.depatrureTime = depatrureTime;
        this.arivelTime = arivelTime;
        this.seats = new Seat[150];
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Seat[] getSeats() {
        return seats;
    }

    public void setSeats(Seat[] seats) {
        this.seats = seats;
    }

    public Airport getFrom() {
        return from;
    }

    public void setFrom(Airport from) {
        this.from = from;
    }

    public Airport getTo() {
        return to;
    }

    public void setTo(Airport to) {
        this.to = to;
    }

    public LocalDateTime getDepatrureTime() {
        return depatrureTime;
    }

    public void setDepatrureTime(LocalDateTime depatrureTime) {
        this.depatrureTime = depatrureTime;
    }

    public LocalDateTime getArivelTime() {
        return arivelTime;
    }

    public void setArivelTime(LocalDateTime arivelTime) {
        this.arivelTime = arivelTime;
    }

    public long getFlightDuration(){               // метод ращета времени перельота
        LocalDateTime tempDate = LocalDateTime.from(depatrureTime);  // сохраняется промежуточное значение
        long hours = tempDate.until(arivelTime, ChronoUnit.HOURS);
        return hours;
    }


    @Override
    public String toString() {                  // Для вивода информации
        return "\nFlight" +
                "\nnumber = " + number +
                "\nfrom = " + from +
                "\nto = " + to +
                "\ndepatrureTime = " + depatrureTime +
                "\narrivalTime = " + arivelTime;
    }
}
