package joins;
import java.sql.*;

public class tablesinnerjoin {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/students";
        String username = "root";
        String password = "Kgmeivb";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String sql = "SELECT * " +
                         "FROM designationtable t1 " +
                         "INNER JOIN employeedetails t2 ON t1.desigid = t2.desigid " +
                         "INNER JOIN qualificationtable t3 ON t2.qualificationid = t3.qualificationid";

            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(sql)) {
                    System.out.println(" designation " + " desigid" + " empname " + " gender " + "	qualificationid " + "qualification");
                while (resultSet.next()) {
                    String designation = resultSet.getString("designation");
                    int desigid = resultSet.getInt("desigid");
                    String empname = resultSet.getString("empname");
                     int qualificationid = resultSet.getInt("qualificationid");
                     String qualification = resultSet.getString("qualification");


                    // Process the retrieved data as needed
                    System.out.println(designation + " - " + desigid + " - " + empname+ " - " + qualificationid+ " - " +qualification) ;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

    

