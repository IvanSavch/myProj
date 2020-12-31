package projectNomber1.repository;


import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionImpl {
    private static final String url = "jdbc:mysql://localhost:3306/myProject?serverTimezone=UTC";
    private static final String username = "root";
    private static final String password = "Savchenko2";

    private static java.sql.Connection connection;

    static {
        try {
            connection = DriverManager.getConnection(url, username, password);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static java.sql.Connection getConnection() {
        return connection;
    }

}
