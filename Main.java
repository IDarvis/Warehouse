import java.util.Scanner;

public class Main{

	public static void main(){
		String user_name, url, database;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the URL/IP of the DB: ");
		url = sc.nextLine();
		System.out.print("Enter the DB name: ");
		database = sc.nextLine();
		System.out.print("Enter DB username: ");
		user_name = sc.nextLine();
		Warehouse w = new Warehouse(user_name, url, database);
		System.out.println("Connection to DB established.");
	}

}

