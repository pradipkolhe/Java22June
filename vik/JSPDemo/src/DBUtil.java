import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class DBUtil {

	public static Connection openConnection() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		
		
		Properties p = new Properties();
		
		p.load(new FileInputStream("D:\\Java22June\\vik\\JSPDemo\\driverinfo.properties"));
		
		String driver = p.getProperty("driver");
		
		String url = p.getProperty("url");
		
		String usn = p.getProperty("usn");
		
		String pwd = p.getProperty("pwd");
		
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(url,usn,pwd);
	
	
	return con;
	}

}
