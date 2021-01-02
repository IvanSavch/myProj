package projectNomber1.service;

import projectNomber1.model.Airports;

import java.sql.SQLException;

public interface AirportService {

    void getFlightOfAirport(Airports airports) throws SQLException;
    void getFlightInAirports(Airports airports) throws SQLException;
}
