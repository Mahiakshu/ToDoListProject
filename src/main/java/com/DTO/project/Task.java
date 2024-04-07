package com.DTO.project;

public class Task 
{
	private int taskid;
	
	private String tasktitle;
	
	private String taskdescription;
	
	private String taskpriority;
	
	private String taskduedate;
	
	private String taskstatus;
	
	private int userid;
	
	public Task() 
	{
	
	}
	public Task(int taskid, String tasktitle, String taskdescription, String taskpriority, String taskduedate,
			String taskstatus, int userid) {
		super();
		this.taskid = taskid;
		this.tasktitle = tasktitle;
		this.taskdescription = taskdescription;
		this.taskpriority = taskpriority;
		this.taskduedate = taskduedate;
		this.taskstatus = taskstatus;
		this.userid = userid;
	}
	public int getTaskid() {
		return taskid;
	}
	public void setTaskid(int taskid) {
		this.taskid = taskid;
	}
	public String getTasktitle() {
		return tasktitle;
	}
	public void setTasktitle(String tasktitle) {
		this.tasktitle = tasktitle;
	}
	public String getTaskdescription() {
		return taskdescription;
	}
	public void setTaskdescription(String taskdescription) {
		this.taskdescription = taskdescription;
	}
	public String getTaskpriority() {
		return taskpriority;
	}
	public void setTaskpriority(String taskpriority) {
		this.taskpriority = taskpriority;
	}
	public String getTaskduedate() {
		return taskduedate;
	}
	public void setTaskduedate(String taskduedate) {
		this.taskduedate = taskduedate;
	}
	public String getTaskstatus() {
		return taskstatus;
	}
	public void setTaskstatus(String taskstatus) {
		this.taskstatus = taskstatus;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	
	
	

}
