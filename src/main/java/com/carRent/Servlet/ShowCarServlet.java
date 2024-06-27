package com.carRent.Servlet;

import java.io.IOException;

import com.carRent.Bean.ShowCarBean;
import com.carRent.DAO.ShowCarDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/showCar")
public class ShowCarServlet extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		try {
			long aadharNo=Long.parseLong(req.getParameter("aadharNo"));
			
			ShowCarDAO scd=new ShowCarDAO();
			ShowCarBean yourRentedCar = scd.getYourRentedCar(aadharNo);
			if(yourRentedCar!=null)
			{
				req.setAttribute("yourCar", yourRentedCar);
				req.getRequestDispatcher("showCar.jsp").forward(req, resp);
			}
			else
			{
				req.getRequestDispatcher("notRented.jsp").forward(req, resp);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("exception", e);
			req.getRequestDispatcher("somethingWrong.jsp").forward(req, resp);
		}
	}

}
