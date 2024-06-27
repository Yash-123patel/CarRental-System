package com.carRent.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.carRent.CommonPacakage.DBConnection;

public class GetReturnStatusDAO 
{
	public static int getStatus(String name) throws SQLException
	{
		System.out.println(name);
		int k=0;
		int count=0;
		Connection con=DBConnection.getDBConnection();
		
			PreparedStatement ps=con.prepareStatement("select count(*) from bookedcar where PERSONNAME=? ");
			ps.setString(1, name);
			ResultSet rs1 = ps.executeQuery();
			if(rs1.next())
			{
				
				count = rs1.getInt(1);
			}
			System.out.println("count"+count);
			if(count>0)
			{
				
					PreparedStatement pstmt=con.prepareStatement("select * from bookedCar where personname=?");
					pstmt.setString(1, name);
					ResultSet rs = pstmt.executeQuery();
					while(rs.next())
					{
						k=rs.getInt(7);
					}
					System.out.println("sjdhf: "+k);
			
			}		
			else
				k=2;
		
			System.out.println("K: "+k);
		return k;
	}


}
