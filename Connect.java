import java.sql.*;

public class Connect{

	private Connection con;
	private String user_name, url, password;

	Connect(String user_name, String url, String database, String password) throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		this.user_name = user_name;
		this.url = "jdbc:mysql://" + url + ":3306/" + database + "?useLegacyDatetimeCode=false&serverTimezone=America/Los_Angeles";
		this.password = password;
		this.con = DriverManager.getConnection(this.url, this.user_name, this.password);
	}
}
