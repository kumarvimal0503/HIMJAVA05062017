package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStmtDemo {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			
			Class.forName("com.mysql.jdbc.Driver"); // databse dependen line
			System.out.println("Driver Loaded");
			String url = 
					
					"jdbc:mysql://localhost:3306/test"; //database dependent line
			conn = DriverManager.getConnection(url,"root","root");
			
			System.out.println("Connection Created");
			
			String query = "insert into book values (?,?)";
			
			PreparedStatement stmt = conn.prepareStatement(query);
			

			for(int i = 1 ; i < 5 ; i++){
				Scanner s = new Scanner(System.in);
				System.out.print("Enter book Id: ");
				String book_id = s.nextLine();
				
				System.out.print("Enter book Name: ");
				String book_Name = s.nextLine();
				
				stmt.setString(1,book_id);
				stmt.setString(2,book_Name);
				
				
				stmt.executeUpdate();
			}
			
			
			
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


