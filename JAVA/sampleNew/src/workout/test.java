package workout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class test {
    


    public static void main(String[] args){
       
        try( Scanner scanner = new Scanner(System.in);
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","Kgmeivb")){

            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("connecting to databse");
                   
             System.out.println("CONNECTION ESTABLISHED");
            Statement st=con.createStatement();
            System.out.println("ENTER THE DESIGID :");
            int desigid = scanner.nextInt();
             System.out.println("ENTER THE DESIGNATION :");
             String designation = scanner.nextLine();
            

            st.executeUpdate("insert into designationtable('"+desigid+"','"+designation+"')");
            System.out.println("Successfully Inserted");
            
           
            con.close();
        } catch(ClassNotFoundException e) {
            e.printStackTrace(); 
        }catch(SQLException e){
           e.printStackTrace();
        }
    }
}



    

