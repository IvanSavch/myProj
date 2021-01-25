package projectNomber1.service;

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
    public void addFlight(String departureAirport, String departureTime, String arrivalAirport, String arrivalTime) throws SQLException {
        flightRepository.addFlight(departureAirport,departureTime,arrivalAirport,arrivalTime);
    }

    @Override
    public void getIdAirport(String airport) throws SQLException {
        flightRepository.getIdAirports(airport);
    }
}
