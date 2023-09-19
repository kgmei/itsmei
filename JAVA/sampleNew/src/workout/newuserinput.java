package workout;

import java.sql.*;
import java.util.Scanner;

public class newuserinput {
    public static void main(String[] args) {
         String url = "jdbc:mysql://localhost:3306/students";
        String username = "root";
        String password = "Kgmeivb";

        try (Scanner scanner = new Scanner(System.in);
            Connection connection = DriverManager.getConnection(url, username, password)) {
            

            boolean continueInsertion = true;
            while (continueInsertion) {
                System.out.print("Enter the value for column1 (or 'quit' to exit): ");
                String qualificationid = scanner.nextLine();

                if (qualificationid.equalsIgnoreCase("quit")) {
                    continueInsertion = false;
                    break;
                }

                System.out.print("Enter the value for column2: ");
                String qualification = scanner.nextLine();

                String sql = "INSERT INTO qualificationtable (qualificationid, qualification) VALUES (?, ?)";

                try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                    preparedStatement.setString(1, qualificationid);
                    preparedStatement.setString(2, qualification);
                    int rowsInserted = preparedStatement.executeUpdate();
                    System.out.println("Rows inserted: " + rowsInserted);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


