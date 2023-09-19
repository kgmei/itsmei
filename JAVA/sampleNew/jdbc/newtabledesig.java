package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class newtabledesig {
    public static void main(String[] args) {
     String url = "jdbc:mysql://localhost:3306/students";
        String username = "root";
        String password = "Kgmeivb";
      // Open a connection
      try(Connection conn = DriverManager.getConnection(url,username,password);
         Statement stmt = conn.createStatement();
      ) {		      
          String sql = "CREATE TABLE employee" +
                   "(desigid INTEGER not NULL, " +
                   " designation VARCHAR(255), " +  
                   " PRIMARY KEY ( desigid ))"; 

         stmt.executeUpdate(sql);
         System.out.println("Created table in given database...");   	  
      } catch (SQLException e) {
         e.printStackTrace();
      } 
      
   }
}

    

