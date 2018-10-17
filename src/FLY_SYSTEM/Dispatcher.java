package FLY_SYSTEM;

import java.util.ArrayList;
import java.util.List;

public class Dispatcher {
    private List<Flight> flights = new ArrayList<>();

    public boolean addFlight(Flight someFlight){    // добавить
        return flights.add(someFlight);
    }

    public void showFlights(){                      // отобразить все перелёты (Для вывода всех актуальных рейсов)
        for (int i = 0; i < flights.size(); i++) {
            System.out.println(flights.get(i).toString());
        }

    }
}
