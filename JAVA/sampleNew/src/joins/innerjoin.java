package joins;
import java.sql.*;
public class innerjoin {
	public static void main(String[] args)
	{
		System.out.println(
			"Joining 2 MySQL tables using inner Join");
		Connection con = null;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/students",
				"root", "Kgmeivb");
			try {
				Statement st = con.createStatement();
				
				ResultSet res = st.executeQuery(
					"SELECT *FROM "
					+ "employeedetails"
					+ " INNER JOIN "
					+ "designationtable");
				System.out.println(" empname"
								+ " gender"
								+ "empid	  "
								+ "qualificatinid"
								+ "	desigid"
                + "designation");

				while (res.next()) {
					String empname = res.getString("empname");
					String gender = res.getString("gender");
					int empid = res.getInt("empid");
					int qualificationid= res.getInt("qualificationid");
					int desigid = res.getInt("desigid");
                    String designation =res.getString("designation");

					System.out.format("%10s%10s%10s%15s%10s%15s\n", "Emp Name", "Gender", "Emp ID", "Qualification ID", "Desig ID", "Designation");
          System.out.format("%10s%10s%10d%15d%10d%15s\n", empname, gender, empid, qualificationid, desigid, designation);
					
				}
				con.close();
			}
			catch (SQLException s) {

				System.out.println(
					"SQL statement is not executed!");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
