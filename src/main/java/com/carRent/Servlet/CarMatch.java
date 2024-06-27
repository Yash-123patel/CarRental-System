package com.carRent.Servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.carRent.CommonPacakage.DBConnection;
import com.carRent.DAO.CarMatchDAO;
import com.carRent.DAO.GETPersonName;
import com.carRent.DAO.GetReturnStatusDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/carmatch")
public class CarMatch extends HttpServlet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		try {
			String carid=req.getParameter("car-id");
			
			System.out.println(carid);
			
			CarMatchDAO cm=new CarMatchDAO();
			List<String> carIdList=cm.getCar();
			
			Iterator<String> itr=carIdList.iterator();
			boolean isMatching=false;
			
			while(itr.hasNext())
			{
				if(carid.equals(itr.next()))
				{
					isMatching=true;
					break;
				}
			}
			HttpSession hs=req.getSession(false);
			if(hs!=null)
			{
				Map<String, Object>map=(Map<String, Object>) hs.getAttribute("map");
				
			    String email =(String) map.get("email");
				
				String name=GETPersonName.getName(email);
				System.out.println("Name: "+name);
				
				
				if(isMatching)
				{
					int k=GetReturnStatusDAO.getStatus(name);
					if(k==1||k==2)
					{
						map.put("carid", carid);
						hs.setAttribute("map", map);
						
						req.getRequestDispatcher("inputDroping.html").forward(req, resp);
					}
					else
					{
						req.getRequestDispatcher("alreadyBooked.jsp").forward(req, resp);	
					}
				}
				else
				{
					req.getRequestDispatcher("noCarAvailable.jsp").forward(req, resp);
				}
				
			}
			else
			{
				req.getRequestDispatcher("sessionExpired.jsp").forward(req, resp);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("exception", e);
			req.getRequestDispatcher("somethingWrong.jsp").forward(req, resp);
		}
	}
		

}
