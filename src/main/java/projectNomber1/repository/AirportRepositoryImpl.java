package projectNomber1.repository;

import projectNomber1.model.Airports;
import projectNomber1.model.Flight;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AirportRepositoryImpl implements AirportRepository {

    private static final String GET_FLIGHTS_OF_AIRPORT =
            "select f.id as 'id', f.aircraft_Number, f.departure_time, f.arrival_time, a_dep.id as 'depAirport', a_dep.airport_name, a_dep.city, a_dep.country, a_ar.id as 'arrivalAirport', a_ar.airport_name, a_ar.city, a_ar.country from flight f join airports a_dep on a_dep.id = f.departure_airport_id join airports a_ar on a_ar.id = f.arrival_airport_id where a_dep.airport_name = ?";
    private static final String GET_FLIGHTS_IN_AIRPORT =
            "select f.id as 'id', f.aircraft_Number, f.departure_time, f.arrival_time, a_dep.id as 'depAirport', a_dep.airport_name, a_dep.city, a_dep.country, a_ar.id as 'arrivalAirport', a_ar.airport_name, a_ar.city, a_ar.country from flight f join airports a_dep on a_dep.id = f.departure_airport_id join airports a_ar on a_ar.id = f.arrival_airport_id where a_ar.airport_name = ?";
    private static final String GET_AIRPORT_ID = "select * from airports where airport_Name = ? ";

    @Override
    public List<Flight> getFlightOfAirport(String airport_Name) throws SQLException {

        List<Flight> flights = new ArrayList<>();
        Connection connection = ConnectionImpl.getConnection();
        PreparedStatement statement = connection.prepareStatement(GET_FLIGHTS_OF_AIRPORT);
        statement.setString(1, airport_Name);
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {

            int id = resultSet.getInt("id");
            String departureAirport = resultSet.getString("depAirport");
            Date departureTime = resultSet.getDate("departure_Time");
            String arrivalAirport = resultSet.getString("arrivalAirport");
            Date arrivalTime = resultSet.getDate("arrival_Time");
            Flight flight = new Flight(id, departureAirport, departureTime, arrivalAirport, arrivalTime);
            System.out.println(flight);
            flights.add(flight);

        }

        return flights;
    }

    @Override
    public List<Flight> getFlightInAirports(String airport_Name) throws SQLException {

        List<Flight> flights = new ArrayList<>();

        Connection connection = ConnectionImpl.getConnection();
        PreparedStatement statement = connection.prepareStatement(GET_FLIGHTS_IN_AIRPORT);
        statement.setString(1, airport_Name);
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {

            int id = resultSet.getInt("id");
            String departureAirport = resultSet.getString("depAirport");
            Date departureTime = resultSet.getDate("departure_Time");
            String arrivalAirport = resultSet.getString("arrivalAirport");
            Date arrivalTime = resultSet.getDate("arrival_Time");
            Flight flight = new Flight(id, departureAirport, departureTime, arrivalAirport, arrivalTime);
            System.out.println(flight);
            flights.add(flight);

        }
        return flights;
    }

    @Override
    public List<Airports> getIdAirports(String airportName) throws SQLException {
        List<Airports> airports = new ArrayList<>();

        Connection connection = ConnectionImpl.getConnection();
        PreparedStatement statement = connection.prepareStatement(GET_AIRPORT_ID);
        statement.setString(1, airportName);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
             int id = resultSet.getInt("id");
            String name = resultSet.getString("airport_Name");
            String city = resultSet.getString("city");
            String country = resultSet.getString("country");
            Airports airports1 = new Airports(id, name, city, country);
            System.out.println(airports);
            airports.add(airports1);
        }
        System.out.println(airports);
        return airports;
    }
}

