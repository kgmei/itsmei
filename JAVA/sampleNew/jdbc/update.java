package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class update {
   
   

   public static void main(String[] args) {
    String url = "jdbc:mysql://localhost:3306/students";
        String username = "root";
        String password = "Kgmeivb";
      // Open a connection
      try(Connection conn = DriverManager.getConnection(url, username, password);
         Statement stmt = conn.createStatement();
      ) {		      
         String sql = "UPDATE qualificationtable " +
            "SET qualification = null WHERE qualificationid IN(6)";
         stmt.executeUpdate(sql);
         System.out.println("A new user has been updated successFully.");
         ResultSet rs = stmt.executeQuery(sql);
        
            System.out.print("QUALIFICATION ID: " + rs.getInt("qualificationid"));
            
            
         
         rs.close();
      } catch (SQLException e) {
         System.out.println();
      } 
   }
}
