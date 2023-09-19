package joins;
import java.sql.*;
public class nullvaluesleftjoin {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/students";
        String username = "root";
        String password = "Kgmeivb";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String sql = "select * from employeedetails, qualificationtable where employeedetails.qualificationid=qualificationtable.qualificationid " ;

            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(sql)) {

                while (resultSet.next()) {
                   int qualificationid = resultSet.getInt("qualificationid");
                    String qualification = resultSet.getString("qualification");
                   
                    System.out.println("qualificationid: " + qualificationid + ", qualification: " + qualification);
                }
                    
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


