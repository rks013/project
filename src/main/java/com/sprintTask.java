
package com;
import java.util.*;
public class sprintTask{
	private int start;
	private int end;
	String name;
	 
	
	public sprintTask(int start, int end) {
		
		this.start = start;
		this.end = end;
	}
	List<Task> taskList = new ArrayList<Task>();
	private static void addTask(List<Task> taskList , Task task) {
		if(taskList.contains(task)) {
			System.out.println("this task is already added");
		}
		taskList.add(task);
	}
}