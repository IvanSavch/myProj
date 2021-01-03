package projectNomber1.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FlightRepositoryImpl implements FlightRepository {

    private static final String INSERT_FLIGHT =
            "insert into flight value(null,'%s',date((now)),1-1-2020)";
    @Override
    public void extractFlight() throws SQLException {

    }
}
