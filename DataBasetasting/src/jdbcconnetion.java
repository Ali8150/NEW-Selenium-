import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcconnetion {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

	
		
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cadantial","root","Md01715580403" );
		
		Statement s= con.createStatement();
		
		ResultSet rs = s.executeQuery("Select *from info where scenario ='zeroblance'");
		
		
		while(rs.next()) {
			
			System.out.println(rs.getString("username"));
			
			System.out.println(rs.getString("password"));
			
			
		}
		
		
		
	}

}
