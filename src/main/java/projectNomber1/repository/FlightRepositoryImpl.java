package projectNomber1.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FlightRepositoryImpl {

    private static final String INSERT_FLIGHT =
            "insert into flight value(null,?,date((now)),1-1-2020)";
    private static final String GET_FLIGHT_OF_AIRPORTS =
            "select * from flight where ?";
    private  static final String GET_FLIGHT_IN_AIRPORTS =
            "select * from flight where ?";




}
