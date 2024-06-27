package com.carRent.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.carRent.Bean.CarUserBean;
import com.carRent.CommonPacakage.DBConnection;

public class UserRegisterDAO
{
	public int registerCarUser(CarUserBean cub) throws SQLException
	{
		int insertCount=0;
		Connection con=DBConnection.getDBConnection();
		
			PreparedStatement pstmt=con.prepareStatement("insert into RegisterCarUsers values(c1.nextval,?,?,?,?,?,?,?)");
			pstmt.setString(1, cub.getFullName());
			pstmt.setString(2, cub.getEmail());
			pstmt.setString(3, cub.getPassword());
			pstmt.setLong(4, cub.getMobileNo());
			pstmt.setString(5, cub.getAddress());
			pstmt.setLong(6, cub.getAadharNo());
			pstmt.setString(7, cub.getLicenseNo());
			
			insertCount=pstmt.executeUpdate();
			
			
			return insertCount;	
		
	}
}
