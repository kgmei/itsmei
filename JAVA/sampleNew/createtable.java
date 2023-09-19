
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class createtable {
 
   public static void main(String[] args) {
     String url = "jdbc:mysql://localhost:3306/students";
        String username = "root";
        String password = "Kgmeivb";
      
      try(Connection conn = DriverManager.getConnection(url,username,password);
         Statement stmt = conn.createStatement();
      ) {		      
          String sql = "CREATE TABLE employeelist" +
                   "(fullName VARCHAR(250),"+
                  "empcode INTEGER not NULL, " +
                   "salary int,"+
                   "city text, " +  
                   " PRIMARY KEY ( empcode ))";
                   

                   

         stmt.executeUpdate(sql);
         System.out.println("Created table in given database...");   	  
      } catch (SQLException e) {
         e.printStackTrace();
      } 
      
   }
}
