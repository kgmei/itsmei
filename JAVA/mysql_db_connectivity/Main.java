import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
  public static void main(String[] args) {
    try {

      Class.forName("com.mysql.jdbc.Driver");

      Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root",
          "Kgmeivb");
      Statement st = con.createStatement();
      String query = "select * from studentdetails";
      ResultSet rs = st.executeQuery(query);

      while (rs.next()) {
        System.out.println(rs.getString(1));
      }

    } catch (Exception ee) {
      System.out.println(ee);
    }

  }
}