package com.carRent.DAO;

import java.sql.Connection;

import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Period;

import com.carRent.Bean.BiillBean;
import com.carRent.CommonPacakage.DBConnection;

public class BillDAO
{

	public BiillBean getBill(String carid,String email,LocalDate todaysDdate,long aadharNo) throws SQLException
	{
		Connection con=DBConnection.getDBConnection();
		BiillBean bib=null;
		
			PreparedStatement pstmt=con.prepareStatement("select * from cardetails where carid=?");
			pstmt.setString(1, carid);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			String carname=rs.getString(2);
			double perDayCharge=rs.getDouble(3);
			
			PreparedStatement pstmt2=con.prepareStatement("select * from registercarusers where email=?");
			pstmt2.setString(1, email);
			ResultSet rs2 = pstmt2.executeQuery();
			rs2.next();
			String name=rs2.getString(2);
			String licenseNo=rs2.getString(8);
			
			
			PreparedStatement pstmt3=con.prepareStatement("select * from bookedcar where carid=? and aadharno=? ");
			pstmt3.setString(1, carid);
			pstmt3.setLong(2,aadharNo );
			ResultSet rs3 = pstmt3.executeQuery();
			rs3.next();
			Date bookingDate=rs3.getDate(5);
			Date dropingDate=rs3.getDate(6);
			
			
			LocalDate sd = LocalDate.of(bookingDate.getYear()+1900,bookingDate.getMonth()+1,bookingDate.getDate());
			LocalDate ed = LocalDate.of(dropingDate.getYear()+1900,dropingDate.getMonth()+1,dropingDate.getDate());
			Period diff = Period.between(sd, ed);
			System.out.println(diff);
			int numberOfDays=(diff.getYears()*365+diff.getMonths()*30+diff.getDays());
			System.out.println(numberOfDays);
			Date current=new Date();
			
			LocalDate cd=LocalDate.of(current.getYear()+1900, current.getMonth()+1, current.getDate());
			
			Period diff2=Period.between(ed, cd);
			int extraDyas=(diff2.getYears()*365+diff2.getMonths()*30+diff2.getDays());
			System.out.println(extraDyas);
			
			bib=new BiillBean(name, aadharNo, licenseNo,carid, carname, perDayCharge, numberOfDays, extraDyas);
			
		
		return bib;
	}
}
