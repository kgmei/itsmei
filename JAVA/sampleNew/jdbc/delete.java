package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class delete {
   
   static final String QUERY = "SELECT id, first, last, age FROM Registration";

   public static void main(String[] args) {
    String url = "jdbc:mysql://localhost:3306/students";
        String username = "root";
        String password = "Kgmeivb";
      // Open a connection
      try(Connection conn = DriverManager.getConnection(url,username,password);
         Statement stmt = conn.createStatement();
      ) {		      
         String sql =" DELETE FROM designationtable WHERE designation = 'it' ";
         stmt.executeUpdate(sql);
         System.out.println("A new user has been deleted successFully.");
         ResultSet rs = stmt.executeQuery(QUERY);
         
         rs.close();
      } catch (SQLException e) {
        System.out.println();
      } 
   }
}