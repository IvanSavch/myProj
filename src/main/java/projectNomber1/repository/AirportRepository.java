package projectNomber1.repository;

import projectNomber1.model.Airports;
import projectNomber1.model.Flight;

import java.sql.SQLException;
import java.util.List;

public interface AirportRepository {

    List<Flight> getFlightOfAirport(String airportName) throws SQLException;
    List<Flight> getFlightInAirports(String airportName) throws SQLException;
    int getIdAirports(String airportName)throws SQLException;
}
