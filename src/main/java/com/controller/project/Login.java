package com.controller.project;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.project.Dao;
import com.DTO.project.Task;
import com.DTO.project.User;

@WebServlet("/userlogin")
public class Login extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email");
		String pass =req.getParameter("password");
		
		Dao dao = new Dao();
		
		try {
			User u =dao.findByEmail(email);
			if (u!=null) 
			{
				//verify the password
				if (u.getUserpassword().equals(pass)) 
				{
					//login success
					// create session and set the data
					// get all the tasks related to the user id
					
					List<Task> tasks = dao.getalltasksbyuserid(u.getUserid());
					req.setAttribute("tasks", tasks);
					
					HttpSession session = req.getSession();
					session.setAttribute("user", u);
					
					req.getRequestDispatcher("home.jsp").include(req, resp);
				}
				else 
				{
					req.setAttribute("message", "password wrong");
					req.getRequestDispatcher("login.jsp").include(req, resp);
				}
				
			}
			else {
				// email failed
				req.setAttribute("message", "wrong email");
				req.getRequestDispatcher("login.jsp").include(req, resp);
				
			}
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
