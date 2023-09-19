import java.sql.*;
// import java.sql.DriverManager;
// import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/students";
        String username = "root";
        String password = "Kgmeivb";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Load the JDBC driver
            Connection connection = DriverManager.getConnection(url, username, password);
            // Connection established
            System.out.println("Connected to the database!");

            // Perform database operations

            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            // Driver not found
        } catch (SQLException e) {
            e.printStackTrace();
            // Connection failed
        }
    }
}
