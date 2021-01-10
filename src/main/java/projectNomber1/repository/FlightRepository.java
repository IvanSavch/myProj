package projectNomber1.repository;

import java.sql.SQLException;

public interface FlightRepository {

    void addFlight(String departureAirport, String departureTime, String arrivalAirport, String arrivalTime) throws SQLException;

}
