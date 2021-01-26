package projectNomber1.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FlightRepositoryImpl implements FlightRepository {

    private static final String INSERT_FLIGHT =
            "insert into flight values (null,1,?,?,?,?)";

    @Override
    public void addFlight(String departureAirport, String departureTime, String arrivalAirport, String arrivalTime) throws SQLException {
        Connection connection = ConnectionImpl.getConnection();
        PreparedStatement statement = connection.prepareStatement(INSERT_FLIGHT);
        statement.setString(1, departureAirport);
        statement.setString(2, departureTime);
        statement.setString(3, arrivalAirport);
        statement.setString(4, arrivalTime);
        statement.executeUpdate();

    }
}
