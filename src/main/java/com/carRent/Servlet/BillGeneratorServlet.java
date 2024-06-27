package com.carRent.Servlet;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Map;

import com.carRent.Bean.BiillBean;
import com.carRent.DAO.BillDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/bill")
public class BillGeneratorServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		try {
			HttpSession hs=req.getSession(false);
			if(hs!=null)
			{
				Map<String ,Object>map=(Map<String, Object>) hs.getAttribute("map");
				String carid = (String) map.get("carid");
				String email = (String) map.get("email");
				long aadharNo=(long) map.get("aadhar");
				
				System.out.println(email);
				
				
				BillDAO bd=new BillDAO();
				
				LocalDate todaysDate =LocalDate.now();
				BiillBean bill = bd.getBill(carid, email, todaysDate,aadharNo);
				
				double totalPay=bill.getPerDayCharge()*bill.getTotalDays();
				if(bill.getExtraDays()>0)
				{
					totalPay+=bill.getExtraDays()*1200;
					
				}
				
				if(bill!=null)
				{
					req.setAttribute("bill", bill);
					req.setAttribute("total", totalPay);
					req.getRequestDispatcher("bill.jsp").forward(req, resp);
					
					
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

