package com.carRent.CommonPacakage;

import java.sql.Connection;
import java.sql.DriverManager;

public  class DBConnection
{
	private static Connection con;
	
	static{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "root");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public static Connection getDBConnection()
	{
	   return con;
	}
}
