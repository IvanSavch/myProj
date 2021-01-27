package projectNomber1.service;


import java.sql.SQLException;

public interface FlightService {

    void addFlight(int departureAirport, String departureTime, int arrivalAirport, String arrivalTime) throws SQLException;
}
