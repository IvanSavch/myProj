package projectNomber1.service;

import java.sql.SQLException;

public interface AirportService {

    void getFlightOfAirport(String airportName) throws SQLException;
    void getFlightInAirports(String airportName) throws SQLException;
    int getIdAirport(String airport) throws SQLException;
}
