package FLY_SYSTEM;

public class Airport {
    private String country;  // Страна
    private String city;     // Город
    private Dispatcher dispatcher;


    public Airport(String country, String city, Dispatcher dispatcher) {
        this.country = country;
        this.city = city;
        this.dispatcher = dispatcher;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Dispatcher getDispatcher() {
        return dispatcher;
    }

    public void setDispatcher(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    @Override
    public String toString() {            // Для вивода информации
        return "Airport{" +
                "country = '" + country + '\'' +
                ", city ='" + city + '\'' +
                '}';
    }
}
