package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws Exception {

         String url = "jdbc:mysql://localhost:3306/students";
        String username = "root";
        String password = "Kgmeivb";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            Connection connection = DriverManager.getConnection(url, username, password);
            
            System.out.println("Connected to the database!");

            

            connection.close();
        } catch (ClassNotFoundException e) {
            System.out.println();
            
        } catch (SQLException e) {
            System.out.println();
            
        }
    }
    }
