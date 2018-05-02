import java.sql.*

public class Connect{

	Connection con;
	private String user_name, url, password;

	public void Connect(String user_name, String url, String database, String password){
		this.user_name = user_name;
		this.url = "jdbc:oracle:thin:@" + url + ":3306:" + database;
		this.password = password;
		this.con = DriverManager.getConnection(this.url, this.user_name, this.password)
	}
}