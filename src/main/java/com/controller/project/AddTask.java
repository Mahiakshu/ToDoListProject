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
import com.DTO.project.Task;
import com.DTO.project.User;
import com.mysql.cj.Session;

@WebServlet("/addtask")

public class AddTask extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     
		int taskdid = Integer.parseInt(req.getParameter("taskid"));
		String tasktitle = req.getParameter("tasktitle");
		String taskdescription=req.getParameter("taskdescription");
		String taskpriority = req.getParameter("taskpriority");
		String taskduedate = req.getParameter("taskduedate");
		User user = (User)req.getSession().getAttribute("user");
		int userid = user.getUserid();
		
		Task task = new Task(taskdid, tasktitle, taskdescription, taskpriority, taskduedate,"pending", userid);
		
		Dao dao = new Dao();
		
		try 
		{
			int res = dao.createtask(task);
			
			if (res>0) 
			{
				HttpSession session = req.getSession();
				User u =(User)session.getAttribute("user");
				
				req.setAttribute("tasks", dao.getalltasksbyuserid(u.getUserid()));
				
				RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
				rd.include(req, resp);

			}
			else 
			{
				resp.getWriter().print("task failed");
			}
		} 
		catch (ClassNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
