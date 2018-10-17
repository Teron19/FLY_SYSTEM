package FLY_SYSTEM;

import java.time.LocalDateTime;

public class FlightTest {
    public static void main(String[] args) {
        Airport fAirp = new Airport("USA", "Dallas", new Dispatcher());
        Airport sAirp = new Airport("Ukraine", "Lviv", new Dispatcher());
        Airport thAirp = new Airport("Turkish", "Dalaman", new Dispatcher());

        Airport forAirp = new Airport("Russia", "Moskva", new Dispatcher());
        Airport fiveAirp = new Airport("Ukraine", "Chernivci", new Dispatcher());

            Flight threeFlight = new Flight("UC565", forAirp, fiveAirp,
                    LocalDateTime.of(2018, 12, 20, 4, 20),
                    LocalDateTime.of(2018,12, 21, 1, 30));

                    forAirp.getDispatcher().addFlight(threeFlight);
                    fiveAirp.getDispatcher().addFlight(threeFlight);

                    System.out.println(threeFlight);
                    System.out.println("flight time = " + threeFlight.getFlightDuration() + " (hour in flight)");


        Flight someFlight = new Flight("UU124", sAirp, fAirp,
                LocalDateTime.of(2018, 10, 15, 4, 30),  //Дата и время когда вылетаем
                LocalDateTime.of(2018, 10, 16, 1, 25)); // Дата прибытия

        Flight secondFLight = new Flight ("UT456", sAirp, thAirp,
                LocalDateTime.of(2018, 11, 15, 4, 30),
                LocalDateTime.of(2018, 11, 16, 1, 25));

        fAirp.getDispatcher().addFlight(someFlight);  // для 1 диспечера
        sAirp.getDispatcher().addFlight(someFlight);  // для 2 диспетчера


        //sAirp.getDispatcher().addFlight(secondFLight);
        //thAirp.getDispatcher().addFlight(secondFLight);

        //sAirp.getDispatcher().showFlights();
                //System.out.println(someFlight);//вивести информацию о полёте UU124

       // System.out.println(secondFLight); // вывод информации о полёте  UT456

                //System.out.println(someFlight.getFlightDuration());  // вывести информация для разницы между полётами

        //sAirp.getDispatcher().showFlights();     // помойму показывает все рейсы с этого города или страны
    }
}

