package com.carRent.Servlet;

import java.io.IOException;
import java.util.Map;

import com.carRent.Bean.CarUserBean;
import com.carRent.Bean.ConfirmBookingBean;
import com.carRent.DAO.ConfirmBookingDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/confirmBooking")

public class ConfirmBookingServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		 try {
			 HttpSession hs=req.getSession(false);
			 if(hs!=null)
			 {
				 Map<String, Object>map=(Map<String, Object>) hs.getAttribute("map");
			      
					ConfirmBookingBean cbb=(ConfirmBookingBean) map.get("CarDetails");
					  System.out.println();
					  ConfirmBookingDAO cbd=new ConfirmBookingDAO();
					  int bookStatus = cbd.bookCar(cbb);		  
					  if(bookStatus>0)
					  {
						  req.setAttribute("username", cbb.getPersonName());
						  req.getRequestDispatcher("bookingSuccessfull.jsp").forward(req, resp);
					  }
					  else
					  {
						  req.getRequestDispatcher("bookingFailed.jsp").forward(req, resp);
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
