package com.carRent.Servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/pay")
public class Payment extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		try {
			req.getRequestDispatcher("payment.html").forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("exception", e);
			req.getRequestDispatcher("somethingWrong.jsp").forward(req, resp);
		}
	}

}
