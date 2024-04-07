package com.controller.project;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.project.Dao;
import com.DTO.project.User;

@WebServlet("/delete")
public class Delete extends  HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt( req.getParameter("taskid"));
		
		Dao dao = new Dao();
		
		try 
		{
		    dao.deletetaskbyid(id);
		    
		    HttpSession session = req.getSession();
			User u =(User)session.getAttribute("user");
			
			req.setAttribute("tasks", dao.getalltasksbyuserid(u.getUserid()));
			
			RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
			rd.include(req, resp);
		} 
		catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}

}
