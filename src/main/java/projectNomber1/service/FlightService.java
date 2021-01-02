package projectNomber1.service;

import projectNomber1.model.Flight;

import java.sql.SQLException;

public interface FlightService {

    void extractFlight(Flight flight) throws SQLException;


}
