package projectNomber1.repository;

import projectNomber1.model.Flight;

import java.sql.SQLException;

public interface FlightRepository {

    void extractFlight() throws SQLException;

}
