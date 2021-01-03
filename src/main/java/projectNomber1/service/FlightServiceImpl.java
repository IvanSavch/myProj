package projectNomber1.service;

import projectNomber1.model.Flight;
import projectNomber1.repository.FlightRepository;
import projectNomber1.repository.FlightRepositoryImpl;

import java.sql.SQLException;

public class FlightServiceImpl implements FlightService {

    private final FlightRepository flightRepository;

    public FlightServiceImpl(){
        flightRepository = new FlightRepositoryImpl(){
        };
    }

    @Override
    public void extractFlight(Flight flight) throws SQLException {

        flightRepository.extractFlight();

    }
}
