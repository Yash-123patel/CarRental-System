package com.carRent.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.carRent.Bean.CarUserBean;
import com.carRent.CommonPacakage.DBConnection;

public class UserLoginDAO 
{
	public CarUserBean getLogin(String email,String password) throws SQLException
	{
		CarUserBean cub=null;
		
		Connection con=DBConnection.getDBConnection();
		
		
			PreparedStatement pstmt =con.prepareStatement("select * from RegisterCarUsers where EMAIL=? and PASSWORD=?");
			pstmt.setString(1, email);
			pstmt.setString(2, password);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next())
			{
				cub=new CarUserBean(rs.getString(2),rs.getString(3),rs.getString(4),rs.getLong(5),rs.getString(6),rs.getLong(7),rs.getString(8));
			}
		
		return cub;
	}
}
