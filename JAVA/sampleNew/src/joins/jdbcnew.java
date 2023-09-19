package joins;

import java.sql.*;
import java.util.Scanner;

public class jdbcnew {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/students";
        String username = "root";
        String password = "Kgmeivb";

         try ( Scanner scanner = new Scanner(System.in);
            Connection connection = DriverManager.getConnection(url, username, password)) {
           

            System.out.print("Enter the value for column1: ");
            String desigid = scanner.nextLine();

            System.out.print("Enter the value for column2: ");
            String designation = scanner.nextLine();

            String sql = "INSERT INTO designationtable (desigid, designation) VALUES (?, ?)";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, desigid);
                preparedStatement.setString(2, designation);
                int rowsInserted = preparedStatement.executeUpdate();
                System.out.println("Rows inserted: " + rowsInserted);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
