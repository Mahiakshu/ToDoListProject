package com.controller.project;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.project.Dao;
import com.DTO.project.Task;
@WebServlet("/edit")
public class EditTask extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  int taskId = Integer.parseInt(req.getParameter("taskid"));
	 
	  Dao dao = new Dao();
	  
	  try 
	    {
		Task task = dao.getTaskBasedOnId(taskId);
		
		req.setAttribute("tasks",task);
		
		RequestDispatcher rd = req.getRequestDispatcher("edittask.jsp");
		
		rd.include(req, resp);
		
	    }  
	   catch (ClassNotFoundException | SQLException e) 
	   {
		e.printStackTrace();
	   }
	}

}
