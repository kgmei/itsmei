package joins;
 import java.sql.*;

public class newinnerjoin {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/students";
        String username = "root";
        String password = "Kgmeivb";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String sql = "SELECT * " +
                         "FROM employeedetails " +
                         "INNER JOIN designationtable ON employeedetails.desigid = designationtable.desigid";

            try (PreparedStatement statement = connection.prepareStatement(sql);
                 ResultSet resultSet = statement.executeQuery()) {
                System.out.println(" designation " + " desigid" + " empname " + " gender " + "	qualificationid ");
                while (resultSet.next()) {
                    String designation = resultSet.getString("designation");
                    int desigid = resultSet.getInt("desigid");
                    String empname = resultSet.getString("empname");
                    String gender = resultSet.getString("gender");
                     String qualificationid = resultSet.getString("qualificationid");
                    
                    String processedData = designation + "  -  " + desigid + "  -  " + empname+ "  -  " + gender+ "  -  " +qualificationid;
                    System.out.println(processedData);
                }
            }
             
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
