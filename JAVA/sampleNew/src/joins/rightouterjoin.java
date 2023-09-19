package joins;
import java.sql.*;
public class rightouterjoin {
    
    public static void main(String a[] ){
         Connection con = null;
         String url ="jdbc:mysql://localhost:3306/";
         String dbName = "students";
         String userName = "root";
         String password = "Kgmeivb";
         try {
             con = DriverManager.getConnection(url+dbName,userName,password);
            Statement st = con.createStatement();
              ResultSet rs = st.executeQuery("select * from employeedetails, qualificationtable where employeedetails.qualificationid=qualificationtable.qualificationid ");
  while( rs.next() ) {
  String data = rs.getString(3);
  System.out.println( data );
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

    

