package projectNomber1.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FlightRepositoryImpl implements FlightRepository {

    private static final String INSERT_FLIGHT =
            "insert into flight value(null,1,?,?,?,?)";

    @Override
    public void addFlight(String departureAirport, String departureTime, String arrivalAirport, String arrivalTime) throws SQLException {
        Connection connection = ConnectionImpl.getConnection();
        PreparedStatement statement = connection.prepareStatement(INSERT_FLIGHT);
        statement.setInt(1,Integer.parseInt(departureAirport));
        statement.setString(2,departureTime);
        statement.setInt(3,Integer.parseInt(arrivalAirport));
        statement.setString(4,arrivalTime);
statement.executeUpdate();
    }
}
