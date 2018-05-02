import java.sql.*;
import java.io.Console;

public class Warehouse{
	
	/* Variables */
	private Connect con;
	private String url, user_name, database, password;

	/* Constructor to create the connection to the Database using the connector class */
	public void Warehouse(String user_name, String url, String database. String password){
		this.user_name = user_name;
		this.url = url;
		this.database = database;
		this.password = password;
		this.con = Connect(user_name, url, database, this.password);
	}

	

}