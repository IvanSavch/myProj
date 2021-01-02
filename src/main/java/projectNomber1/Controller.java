package projectNomber1;

import projectNomber1.io.ConsoleIO;
import projectNomber1.io.IOInterface;
import projectNomber1.model.Airports;
import projectNomber1.model.Flight;
import projectNomber1.service.AirportService;
import projectNomber1.service.FlightService;
import projectNomber1.service.FlightServiceImpl;
import java.io.IOException;
import java.sql.SQLException;

public class Controller {

    private final FlightService flightService;
    private final IOInterface ioInterface;
    private final AirportService airportsService;

    public Controller() {
        this.flightService = new FlightServiceImpl();
        this.ioInterface = new ConsoleIO();
        this.airportsService = null;

    }

    public void start() {

Airports airports = null;
Flight flight  = null;

        while (true) {



            boolean cont = true;

            while (cont) {

                cont = mainProcess(airports,flight);

            }
        }
    }


    private boolean mainProcess(Airports airports, Flight flight) {
        System.out.println(IOInterface.MENU_LEGEND);
        String input = "";
        try {
            input = ioInterface.readStringValue();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        try {
            switch (input) {
                case "1":

                    flightService.extractFlight(flight);
                    break;
                case "2":
                    try {
                        String flightOfAirports = ioInterface.readStringValue();
                        assert airportsService != null;
                        airportsService.getFlightOfAirport(airports);
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case "3":
                    try {
                        String flightInAirports = ioInterface.readStringValue();
                        airportsService.getFlightInAirports(airports);
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case "e":
                    return false;
                default:
                    System.err.println("Wrong input");
                    break;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }
}