package projectNomber1.repository;

import java.sql.SQLException;

public interface AirportRepository {

    void getFlightOfAirport(String airportName, String city, String country) throws SQLException;
    void getFlightInAirports(String airportName, String city, String country) throws SQLException;

}
