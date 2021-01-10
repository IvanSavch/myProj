package projectNomber1.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AirportRepositoryImpl implements AirportRepository{

    private static final String GET_FLIGHTS_OF_AIRPORT =
            "select f.id as 'f_id', f.aircraft_Number, f.departure_time, f.arrival_time, a_dep.id as 'a_dep_id', a_dep.airport_name, a_dep.city, a_dep.country, a_ar.id as 'a_ar_id', a_ar.airport_name, a_ar.city, a_ar.country from flight f join airports a_dep on a_dep.id = f.departure_airport_id join airports a_ar on a_ar.id = f.arrival_airport_id where a_dep.airport_name = ?";
    private static final String GET_FLIGHTS_IN_AIRPORT =
            "select f.id as 'f_id', f.aircraft_Number, f.departure_time, f.arrival_time, a_dep.id as 'a_dep_id', a_dep.airport_name, a_dep.city, a_dep.country, a_ar.id as 'a_ar_id', a_ar.airport_name, a_ar.city, a_ar.country from flight f join airports a_dep on a_dep.id = f.departure_airport_id join airports a_ar on a_ar.id = f.arrival_airport_id where a_ar.airport_name = ?";

    @Override
    public void getFlightOfAirport(String airport_Name) throws SQLException {
        Connection connection = ConnectionImpl.getConnection();
        PreparedStatement statement = connection.prepareStatement(GET_FLIGHTS_OF_AIRPORT);
        statement.setString(1,airport_Name);
        ResultSet resultSet = statement.executeQuery();
        resultSet.next();
        if (!resultSet.next()) throw new SQLException("No such airport");
    }

    @Override
    public void getFlightInAirports(String airport_Name) throws SQLException {
        Connection connection = ConnectionImpl.getConnection();
        PreparedStatement statement = connection.prepareStatement(GET_FLIGHTS_IN_AIRPORT);
        statement.setString(1,airport_Name);
        ResultSet resultSet = statement.executeQuery();
        if (!resultSet.next()) throw new SQLException("No such airport");
        resultSet.next();

    }
}

