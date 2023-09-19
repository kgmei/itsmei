package jdbc;
import java.sql.*;
public class select {
   public static void main(String[] args){
    String url = "jdbc:mysql://localhost:3306/students";
        String username = "root";
        String password = "Kgmeivb";

    try{
        Class.forName("com.mysql.cj.jdbc.Driver"); // Load the JDBC driver
            Connection connection = DriverManager.getConnection(url, username, password);
            // Connection established
            System.out.println("Connected to the database!");
          Statement stmt =connection.createStatement();
          ResultSet rs = stmt.executeQuery(" SELECT id,stuname,marks FROM studentdetails ORDER BY id, stuname, marks ASC");
          while(rs.next()){
            System.out.println(rs.getInt(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getInt(3));
          }
          }
            catch(Exception e)
            {
                System.out.println(e);
            }

          }
    
   } 

