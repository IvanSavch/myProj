package projectNomber1.service;

import projectNomber1.model.Airports;

import java.sql.SQLException;

public interface AirportService {

    void getFlightOfAirport(String airportName,String city,String country) throws SQLException;
    void getFlightInAirports(String airportName, String city, String country) throws SQLException;
}
