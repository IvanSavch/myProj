package projectNomber1.repository;

import java.sql.SQLException;

public interface AirportRepository {

    void getFlightOfAirport(String airportName) throws SQLException;
    void getFlightInAirports(String airportName) throws SQLException;

}
