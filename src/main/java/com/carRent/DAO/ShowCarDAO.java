package com.carRent.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.carRent.Bean.ShowCarBean;
import com.carRent.CommonPacakage.DBConnection;

public class ShowCarDAO
{
	public ShowCarBean getYourRentedCar(long aadharNo) throws SQLException
	{
		Connection con=DBConnection.getDBConnection();
		ShowCarBean shb=null;
		
			PreparedStatement pstmt=con.prepareStatement("select * from bookedcar where aadharNo=? and returnstatus=0");
			pstmt.setLong(1, aadharNo);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			if(rs!=null)
			{
				String carid=rs.getString(1);
				String personName=rs.getString(2);
				Date bookDate=rs.getDate(5);
				Date dropDate=rs.getDate(6);
				shb=new ShowCarBean(carid, personName, aadharNo, bookDate, dropDate);
			}
		
		return shb;
	}
}
