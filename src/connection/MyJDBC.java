package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyJDBC {
    private static Connection connection;

    public  MyJDBC() {

    }

    public static Connection getConnection() {
        if (connection == null) {
            try {

                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/managment_library", "root", "");

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
