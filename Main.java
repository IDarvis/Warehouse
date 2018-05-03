import java.util.Scanner;
import java.io.Console;

public class Main{

	public static void main(String[] args){
		String user_name, url, database;
		Scanner sc = new Scanner(System.in);
		Console console = System.console();

		System.out.print("Enter the URL/IP of the DB: ");
		url = sc.nextLine();
		System.out.print("Enter the DB name: ");
		database = sc.nextLine();
		System.out.print("Enter DB username: ");
		user_name = sc.nextLine();
		char pw[] = console.readPassword("Enter your password: ");
		String password = new String(pw);
		try{
			Warehouse w = new Warehouse(user_name, url, database, password);
		}catch (Exception e){
			System.out.println(e);
		}
		System.out.println("Connection to DB established.");
	}

}

