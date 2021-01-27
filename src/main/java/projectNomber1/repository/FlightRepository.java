package projectNomber1.repository;

import java.sql.SQLException;

public interface FlightRepository {

    void addFlight(int departureAirport, String departureTime, int arrivalAirport, String arrivalTime) throws SQLException;
}
