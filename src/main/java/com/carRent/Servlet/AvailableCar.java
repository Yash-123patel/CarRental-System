package com.carRent.Servlet;

import java.io.IOException;
import java.util.Map;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/available")
public class AvailableCar extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		try {
			String city=req.getParameter("city");
			
			HttpSession hs=req.getSession(false);
			if(hs!=null)
			{
				Map<String, Object>map= (Map<String, Object>) hs.getAttribute("map");
				map.put("city", city);
				hs.setAttribute("map", map);
				
				req.getRequestDispatcher("availableCars.html").forward(req, resp);
				
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
