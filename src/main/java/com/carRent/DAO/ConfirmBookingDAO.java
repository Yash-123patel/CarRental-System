package com.carRent.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.carRent.Bean.ConfirmBookingBean;
import com.carRent.CommonPacakage.DBConnection;

public class ConfirmBookingDAO 
{
	public int bookCar(ConfirmBookingBean cbb) 
	{
		Connection con=DBConnection.getDBConnection();
		int k=0;
		
			PreparedStatement pstmt;
			try {
				pstmt = con.prepareStatement("insert into bookedcar values(?,?,?,?,?,?,?,?)");
				pstmt.setString(1, cbb.getCarid());
				pstmt.setString(2, cbb.getPersonName());
				pstmt.setLong(3, cbb.getAadharNo());
				pstmt.setString(4, cbb.getLicenseNo());
				pstmt.setDate(5, Date.valueOf(cbb.getBookingDate()));
				pstmt.setDate(6, Date.valueOf(cbb.getDropDate()));
				pstmt.setInt(7,0);
				pstmt.setDouble(8, cbb.getPerDayCharge());
				
				 k=pstmt.executeUpdate();
				 System.out.println(k);
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
			
		
		return k;
	}

}
