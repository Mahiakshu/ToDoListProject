package com.controller.project;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DTO.project.Task;
import com.DTO.project.User;

@WebServlet("/updatetask")
public class UpdateTask extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int taskid = Integer.parseInt(req.getParameter("taskid"));
		String tasktitle = req.getParameter("tasktitle");
		String taskdescription = req.getParameter("taskdescription");
		String taskpriority = req.getParameter("taskpriority");
		String taskduedate = req.getParameter("taskduedate");
		String taskstatus = req.getParameter("taskstatus");
		
		HttpSession session = req.getSession();
		User user = (User) session.getAttribute("user");
		
		Task task = new Task(taskid, tasktitle, taskdescription, taskpriority, taskduedate, taskstatus, user.getUserid());
		
		System.out.println("------------>"+task+"<--------------");
	}

}
