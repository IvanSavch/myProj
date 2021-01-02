package projectNomber1.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FlightRepositoryImpl {

    private static final String INSERT_FLIGHT =
            "insert into flight value(null,'%s',date((now)),1-1-2020)";
    private static final String GET_FLIGHT_OF_AIRPORTS =
            "select * from airports where nameAirports ? ";
    private  static final String GET_FLIGHT_IN_AIRPORTS =
            "select * from airports where nameAirports ? ";


    public void insertFlight(String name) throws SQLException {

        Connection connection = ConnectionImpl.getConnection();
        PreparedStatement statement = connection.prepareStatement(INSERT_FLIGHT);
        statement.setString(2,name);

      statement.executeUpdate();

    }
    public void selectFlightOf(String name)throws SQLException{

        Connection connection = ConnectionImpl.getConnection();
        PreparedStatement statement = connection.prepareStatement(GET_FLIGHT_OF_AIRPORTS);

        statement.executeUpdate();

    }

}
