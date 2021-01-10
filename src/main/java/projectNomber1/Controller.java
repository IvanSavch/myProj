package projectNomber1;


import projectNomber1.io.ConsoleIO;
import projectNomber1.io.IOInterface;
import projectNomber1.service.AirportService;
import projectNomber1.service.AirportsServiceImpl;
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
        this.airportsService = new AirportsServiceImpl();
    }

    public void start() {


        boolean cont = true;
        while (cont) {
            cont = mainProcess();
        }
    }


    private boolean mainProcess() {
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
                    try {
                        String departAirportCode = ioInterface.readStringValue();
                        String departDate = ioInterface.readStringValue();
                        String arrivalAirportCode = ioInterface.readStringValue();
                        String arrivalDate = ioInterface.readStringValue();
                        flightService.addFlight(departAirportCode, departDate, arrivalAirportCode, arrivalDate);
                        if (arrivalDate == null || departDate == null) {
                            System.out.println("введите дату ");
                        }
                        if (departAirportCode == null || arrivalAirportCode == null) {
                            System.out.println("введите код аэропорта ");
                        }

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case "2":
                    try {
                        String airportName = ioInterface.readStringValue();
                        airportsService.getFlightOfAirport(airportName);
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case "3":
                    try {
                        String airportName = ioInterface.readStringValue();
                        airportsService.getFlightInAirports(airportName);
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