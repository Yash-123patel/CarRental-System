package com.carRent.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.carRent.CommonPacakage.DBConnection;

public class CaRReturnDAO 
{
	public int returnCar(String carid,long aadharNo) throws SQLException
	{
		Connection con = DBConnection.getDBConnection();
		int k=0;
	
			PreparedStatement pstmt=con.prepareStatement("select count(*) from bookedCar where CARID=? and AADHARNO=? and RETURNSTATUS=?");
			pstmt.setString(1, carid);
			pstmt.setLong(2, aadharNo);
			pstmt.setInt(3, 0);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next())
			{
				k=rs.getInt(1);
			}
			
		
		return k;
	}

}
