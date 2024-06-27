package com.carRent.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.carRent.CommonPacakage.DBConnection;

public class GetRegisterStatusDAO 
{

	public static boolean getStatus(String email,long aadhar) throws SQLException
	{
		Connection con=DBConnection.getDBConnection();
		PreparedStatement pstmt=con.prepareStatement("select * from registercarusers where email=? or aadharno=?");
		pstmt.setString(1, email);
		pstmt.setLong(2, aadhar);
		int k = pstmt.executeUpdate();
		if(k==1)
			return false;
		else
			return true;
	}
}
