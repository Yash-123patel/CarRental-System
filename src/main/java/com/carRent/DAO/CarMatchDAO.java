package com.carRent.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.carRent.CommonPacakage.DBConnection;

public class CarMatchDAO
{

	public List<String> getCar() throws SQLException
	{
		
		Connection con=DBConnection.getDBConnection();
		List<String> carIdList=new LinkedList<String>();
		
			PreparedStatement pstmt=con.prepareStatement("select CARID from CARDETAILS");
			ResultSet rs = pstmt.executeQuery();
			
			
			while(rs.next())
			{
				carIdList.add(rs.getString("CARID"));
			}
			
			
		
		return carIdList;
	}
}
