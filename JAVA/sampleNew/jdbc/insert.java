package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insert {
    public static void main(String[] args){
       String url = "jdbc:mysql://localhost:3306/students";
        String username = "root";
        String password = "Kgmeivb";
        try{
            Connection connection = DriverManager.getConnection(url, username, password);
            String sql = "INSERT INTO qualificationtable (qualificationid,qualification)"
            + "VALUES (7,'it')";
            Statement statement = connection.createStatement();
            int rows = statement.executeUpdate(sql);

            if(rows>0){
                System.out.println("A new user has been inserted successFully.");
            }
            connection.close();

        } catch (SQLException ex){
            System.out.println();


        }



    }
    
}
