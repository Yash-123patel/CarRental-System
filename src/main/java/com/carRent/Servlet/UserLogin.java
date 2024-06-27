package com.carRent.Servlet;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import com.carRent.Bean.CarUserBean;
import com.carRent.DAO.UserLoginDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class UserLogin extends HttpServlet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		try {
			String userName=req.getParameter("email");
			String password=req.getParameter("password");
			
			HttpSession hs=req.getSession(true);
			
			UserLoginDAO uld=new UserLoginDAO();
			CarUserBean cub=uld.getLogin(userName, password);
			
		
			if(cub!=null)
			{
				Map<String, Object>map=new LinkedHashMap<String, Object>();
				map.put("email", userName);
				hs.setAttribute("map",map);
				
				hs.setMaxInactiveInterval(1500);
				
				req.getRequestDispatcher("loginOption.html").forward(req, resp);
			}
			else
			{
				req.getRequestDispatcher("loginFailed.jsp").forward(req, resp);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("exception", e);
			req.getRequestDispatcher("somethingWrong.jsp").forward(req, resp);
		}
	}

}
