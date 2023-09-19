package joins;
import java.sql.*;

public class leftouterjoin {
    
    
  
  public static void main(String a[])
  {
   Connection con = null;
 String url = "jdbc:mysql://localhost:3306/";
 String dbName = "students";

 String userName = "root";
 String password = "Kgmeivb";
 try {
  
  con = DriverManager.getConnection(url+dbName,userName,password);
  Statement st = con.createStatement();
  ResultSet rs = st.executeQuery("select * from employeedetails, designationtable where employeedetails.desigid=designationtable.desigid ");
  while( rs.next() ) {
  String designation = rs.getString("designation");
  int desigid = rs.getInt("desigid");
  String empname = rs.getString("empname");
  String processedData = designation + "  -  " + desigid+ " - " + empname ;
  System.out.println(processedData);
  }
  System.out.println("Results");
  st.close();
  }
  catch( Exception e ) {
  System.out.println(e.getMessage());
  e.printStackTrace();
  }
  }
}
    

