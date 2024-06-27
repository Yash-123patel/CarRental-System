package com.carRent.Servlet;

import java.io.IOException;

import com.carRent.Bean.BiillBean;
import com.carRent.DAO.StatusUpdateDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/process_payment")
public class ProcessPayment extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		try {
			HttpSession hs=req.getSession(false);
			if(hs!=null)
			{
				BiillBean bib = (BiillBean) hs.getAttribute("profile");
				
				StatusUpdateDAO sud=new StatusUpdateDAO();
				int k=sud.updateCustomerStatus(bib.getCarId(), bib.getAadharNo());
				if(k>0)
				{
					req.getRequestDispatcher("returnSuccess.jsp").forward(req, resp);
				}
				else
				{
					req.getRequestDispatcher("returnFailed.jsp").forward(req, resp);
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
