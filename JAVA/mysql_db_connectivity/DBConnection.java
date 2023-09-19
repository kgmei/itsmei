import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/students";
        String username = "root";
        String password = "Kgmeivb";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            // Connection established
        } catch (SQLException e) {
            e.printStackTrace();
            // Connection failed
        }
    }
}
