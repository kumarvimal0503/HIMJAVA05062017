package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteQueryDemo {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			
			Class.forName("com.mysql.jdbc.Driver"); // databse dependen line
			System.out.println("Driver Loaded");
			String url = 
					
					"jdbc:mysql://localhost:3306/test"; //database dependent line
			conn = DriverManager.getConnection(url,"root","root");
			
			System.out.println("Connection Created");
			
			Statement stmt = conn.createStatement();
			Scanner s = new Scanner(System.in);
			System.out.print("Enter book Id to delete: ");
			String book_id = s.nextLine();
			
			
			String query = "delete from book where book_id = '"+book_id+"'";
			
			stmt.executeUpdate(query);
			
			System.out.println("Record Deleted");
			
			
		} catch (ClassNotFoundException | SQLException  e) {
			
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				System.out.println("Connection Closed");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
