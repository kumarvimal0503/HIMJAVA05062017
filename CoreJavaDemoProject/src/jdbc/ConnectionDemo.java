package jdbc;

import java.sql.*;

public class ConnectionDemo {

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
			
			ResultSet rs = stmt.executeQuery("select * from student");
			while(rs.next()){
				
				String rollNO = rs.getString("roll_no");
				String name =  rs.getString("name");
				
				System.out.println("Roll NO: "+rollNO);
				System.out.println("Name: "+name);
				
				System.out.println("*******************************************");
				
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
