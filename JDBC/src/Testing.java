import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Testing {
	public static final String driver="oracle.jdbc.driver.OracleDriver";
	public static final String url="jdbc:oracle:thin@localhost:1521:XE";
	public static final String username="SYSTEM";
	public static final String password="190031187";
	public static void main(String args[]) throws ClassNotFoundException, SQLException{
		Class.forName(driver);
		
		Connection con=DriverManager.getConnection(url,username,password);
		if(con != null)
			System.out.println("Connection is successful");
		else
			System.out.println("Connection error");
	}
}
