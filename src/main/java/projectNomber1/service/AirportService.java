package projectNomber1.service;

import projectNomber1.model.Airports;

import java.sql.SQLException;

public interface AirportService {

    void getFlightOfAirport(String airportName) throws SQLException;
    void getFlightInAirports(String airportName) throws SQLException;
    void getIdAirport(String airport) throws SQLException;
}
