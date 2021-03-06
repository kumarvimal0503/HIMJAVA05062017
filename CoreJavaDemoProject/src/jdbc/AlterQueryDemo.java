package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AlterQueryDemo {

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
			
			String query = 
					"ALTER TABLE book"+
						" CHANGE COLUMN book_id book_id VARCHAR(10) NOT NULL FIRST,"+
							" ADD PRIMARY KEY (book_id);";
			
			stmt.execute(query);
			
			System.out.println("COlumn changed");
			
			
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
