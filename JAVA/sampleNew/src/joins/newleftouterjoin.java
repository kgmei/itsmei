package joins;

    import java.sql.*;

public class newleftouterjoin {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/students";
        String username = "root";
        String password = "Kgmeivb";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String sql = "SELECT qualificationtable.qualification, employeedetails.qualificationid" +
                         "FROM qualificationtable t1 " +
                         "LEFT OUTER JOIN employeedetails t2 ON t1.qualificationid = t2.qualificationid";

            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(sql)) {

                while (resultSet.next()) {
                    int qualificationid = resultSet.getInt("qualificationid");
                    String qualification = resultSet.getString("qualification");

                    // Process the retrieved data as needed
                    System.out.println("column1: " + qualificationid + ", column2: " + qualification);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


