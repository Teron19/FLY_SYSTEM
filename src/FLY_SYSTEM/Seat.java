package FLY_SYSTEM;

public class Seat {
    private int number;
    private int price;    // стоимость

    public Seat(int number, int price) {
        this.number = number;
        this.price = price;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {       /// Для вивода информации
        return "Seat{" +
                "number=" + number +
                ", price=" + price +
                '}';
    }
}
