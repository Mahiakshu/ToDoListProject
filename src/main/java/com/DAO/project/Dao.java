package com.DAO.project;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.rowset.serial.SerialBlob;

import com.DTO.project.Task;
import com.DTO.project.User;


public class Dao 
{
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","root");
		return con;
	}
	
	public static int saveUser(User user) throws ClassNotFoundException, SQLException
	{
		Connection con =  getConnection();
		
		PreparedStatement pst = con.prepareStatement("insert into user values(?,?,?,?,?,?)");
		
		pst.setInt(1, user.getUserid());
		pst.setString(2, user.getUsername());
		pst.setString(3, user.getUseremail());
		pst.setString(4,user.getUserpassword());
		pst.setLong(5, user.getUsercontact());
	  
		Blob image=new SerialBlob(user.getUserimage());
	    pst.setBlob(6, image);
		
		int res =  pst.executeUpdate();
		System.out.println(res);
		return res;
	}
	
	public User findByEmail(String email) throws ClassNotFoundException, SQLException 
	{
		Connection con = getConnection();
		PreparedStatement pst = con.prepareStatement("select * from user where useremail =?");
		pst.setString(1, email);
		
		ResultSet rs=pst.executeQuery();
		if (rs.next()) 
		{
			User u = new User();
			u.setUserid(rs.getInt(1));
			u.setUsername(rs.getString(2));
			u.setUseremail(rs.getString(3));
			u.setUserpassword(rs.getString(4));
			u.setUsercontact(rs.getLong(5));	
			Blob blob =rs.getBlob(6);
		// convert blob image into byte[]
			
			
			Blob image = rs.getBlob(6);
			
			byte[] img = image.getBytes(1, (int)image.length());
			
			u.setUserimage(img);
			return u;
	
		}
		
		else {
			return null;
		}

	}
	
	public int createtask(Task task) throws ClassNotFoundException, SQLException 
	{
		Connection con = getConnection();
		
		PreparedStatement pst = con.prepareStatement("insert into task values(?,?,?,?,?,?,?)");
		
		pst.setInt(1, task.getTaskid());
		pst.setString(2, task.getTasktitle());
		pst.setString(3, task.getTaskdescription());
		pst.setString(4, task.getTaskpriority());
		pst.setString(5, task.getTaskduedate());
		pst.setString(6, task.getTaskstatus());
		pst.setInt(7, task.getUserid());
		
		int res = pst.executeUpdate();
		return res;
		
	}
	
	public List<Task> getalltasksbyuserid(int userid) throws ClassNotFoundException, SQLException
	{
		Connection con =getConnection();
		
		PreparedStatement pst = con.prepareStatement("select * from task where userid=?");
		pst.setInt(1, userid);
		
		ResultSet rs = pst.executeQuery();
		
		List<Task> tasks = new ArrayList<>();
		
		while(rs.next()) 
		{
			Task task = new Task(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7));
		    tasks.add(task);
		}
		
		return tasks;
	}
	
	public int deletetaskbyid(int taskid) throws ClassNotFoundException, SQLException 
	{
		Connection con = getConnection();
		
		PreparedStatement pst = con.prepareStatement("delete from task where taskid=?");
		pst.setInt(1, taskid);
		
		int res = pst.executeUpdate(); 
		return res;
		
	}
	
	public Task getTaskBasedOnId(int taskId) throws ClassNotFoundException, SQLException
	{
		Connection con = getConnection();
		PreparedStatement pst = con.prepareStatement("select * from task where taskid=?");
		pst.setInt(1, taskId);
		ResultSet rs = pst.executeQuery();
		rs.next();
		Task task = new Task(taskId ,rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),taskId);
		
		return task;
		
	}

}
