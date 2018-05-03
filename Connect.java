import java.sql.*;

public class Connect{

	private Connection con;
	private String user_name, url, password;

	Connect(String user_name, String url, String database, String password) throws SQLException{
		this.user_name = user_name;
		this.url = "jdbc:mysql://" + url + ":3306:" + database;
		this.password = password;
		this.con = DriverManager.getConnection(this.url, this.user_name, this.password);
	}
}
