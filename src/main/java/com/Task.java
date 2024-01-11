package com;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

enum TaskStatus{
	InProgress,
	Delayed,
	Completed
};

public class Task {

	private int taskId;
	private String taskName;
	private String taskDescription;
	private Date start;
	private Date end;
	
	public Task(int taskId, String taskName ,String taskDescription, Date start, Date end ) {
		this.taskId = taskId;
		this.taskName = taskName;
		this.taskDescription = taskDescription;
		this.start = start;
		this.end = end;
	}
	
	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	@Override
	public String toString() {
		return "task [Task Id=" + taskId + ", Task Name=" + taskName + ", Task Description=" + taskDescription + ", start Date="
				+ start + ", end date=" + end + "]";
	}

}