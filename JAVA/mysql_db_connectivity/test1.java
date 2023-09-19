 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class test {
    


    public static void main(String[] ar){
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        String b=s.nextLine();
        System.out.println("a",a);
        Connectivity c=new Connectivity(a,b);

        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("connecting to databse");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/example","root","Kgmeivb");       
            Statement st=con.createStatement();

            String sql="insert into designationtable(desigid,designation) values(a,'b')";

            st.executeUpdate(sql);
            System.out.println("Successfully Inserted");
            ResultSet rs=st.executeQuery("select * from designationtable");
            while(rs.next()){
                System.out.println(rs.getInt(1)+"  " + rs.getString(2));
            }
            con.close();
        } catch(Exception e) {
            System.out.println(e.getMessage()); 
        }
    }
}

    
}
 {
    
}
