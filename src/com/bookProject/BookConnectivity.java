package com.bookProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BookConnectivity {
	
	public static Connection createConnection()
	{
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookproject","root","Pratik@20");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
	}
	

}
