package workout;

 import java.sql.*;
public class own {
    public static void main(String [] args){
        String url = "jdbc:mysql://localhost:3306/students";
        String username = "root";
        String password = "Kgmeivb";

        try(Connection connection = DriverManager.getConnection(url,username,password)){
            String sql = "SELECT * " +
                         "FROM employeedetails " +
                         "INNER JOIN designationtable ON employeedetails.desigid = designationtable.desigid";
         try(PreparedStatement statement = connection.prepareStatement(sql);
           ResultSet resultSet = statement.executeQuery()){
            System.out.println("designation" + " desigid");
        while(resultSet.next()){
               String designation = resultSet.getString("designation");
                    int desigid = resultSet.getInt("desigid");                          
           System.out.println(designation +" - "+desigid);
        }
           }         
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
}
