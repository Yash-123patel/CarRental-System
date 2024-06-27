package com.carRent.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import com.carRent.Bean.CarUserBean;
import com.carRent.CommonPacakage.DBConnection;
import com.carRent.DAO.GetRegisterStatusDAO;
import com.carRent.DAO.GetReturnStatusDAO;
import com.carRent.DAO.UserRegisterDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class UserRegister extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		try {
			String name=req.getParameter("fullname");
			String email=req.getParameter("email");
			String password=req.getParameter("password");
			long mobileNo=Long.parseLong(req.getParameter("phone"));
			String address=req.getParameter("address");
			long aadharNo=Long.parseLong(req.getParameter("aadhar"));
			String licenseNo=req.getParameter("license");
			
			CarUserBean cub=new CarUserBean(name, email, password, mobileNo, address, aadharNo, licenseNo);
			
			
			String str="""
					<h3 style=color:green;position:absolute;top:40px;left:550px;>{%}</h3>
					""";
			String st="";
			PrintWriter pw =resp.getWriter();
			resp.setContentType("text/html");
			if(GetRegisterStatusDAO.getStatus(email, aadharNo))
			{
				UserRegisterDAO ur=new UserRegisterDAO();
				int registerUserCount = ur.registerCarUser(cub);
				if(registerUserCount>0)
				{
					st+="register Succesfully";
					str=str.replace("{%}", st);
					pw.print(str);
					req.getRequestDispatcher("userLogin.html").include(req, resp);
				}
				else
				{
					req.getRequestDispatcher("registerFailed.jsp").forward(req, resp);
				}
				
			}
			else
			{
				st+="User Already Registerd";
				str=str.replace("{%}", st);
				pw.print(str);
				req.getRequestDispatcher("userLogin.html").include(req, resp);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("exception", e);
			req.getRequestDispatcher("somethingWrong.jsp").forward(req, resp);
		}
	
		
	}
}
