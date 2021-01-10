package projectNomber1.service;


import java.sql.SQLException;

public interface FlightService {

    void addFlight(String departureAirport, String departureTime, String arrivalAirport, String arrivalTime) throws SQLException;

}
