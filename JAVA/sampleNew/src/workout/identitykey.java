package workout;
import java.sql.*;

public class identitykey {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/students";
        String username = "root";
        String password = "Kgmeivb";

        try (Connection connection = DriverManager.getConnection(jdbcURL, username, password)) {
            // Step 1: Create a new table with an identity column
            String createTableSQL = "CREATE TABLE employee (" +
                                    "empid INT AUTO_INCREMENT PRIMARY KEY," +
                                    "empname VARCHAR(255)," +
                                    "gender VARCHAR(200))";
            try (Statement createStatement = connection.createStatement()) {
                createStatement.executeUpdate(createTableSQL);
            }

            
            String copyDataSQL = "INSERT INTO  (column1, column2) SELECT column1, column2 FROM old_table";
            try (Statement copyStatement = connection.createStatement()) {
                copyStatement.executeUpdate(copyDataSQL);
            }

            // Step 3: Drop the old table (optional)
            String dropTableSQL = "DROP TABLE old_table";
            try (Statement dropStatement = connection.createStatement()) {
                dropStatement.executeUpdate(dropTableSQL);
            }

            System.out.println("Identity key added to the new table.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


