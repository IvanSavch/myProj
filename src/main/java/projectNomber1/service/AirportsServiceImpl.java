package projectNomber1.service;

import projectNomber1.repository.AirportRepository;
import projectNomber1.repository.AirportRepositoryImpl;

import java.sql.SQLException;

public class AirportsServiceImpl implements AirportService {

    private final AirportRepository airportRepository;

    public AirportsServiceImpl() {
        airportRepository = new AirportRepositoryImpl() {
        };

    }

    @Override
    public void getFlightOfAirport(String airportName) throws SQLException {
        airportRepository.getFlightOfAirport(airportName);
    }

    @Override
    public void getFlightInAirports(String airportName) throws SQLException {
        airportRepository.getFlightInAirports(airportName);
    }
}
