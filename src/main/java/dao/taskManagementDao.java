package dao;
import com.Task;

import java.sql.*;
import java.sql.Date;
import java.util.*;

public class taskManagementDao {
	
	
	
	
	public static List<Task> getAllProducts()
	{
		List<Task> taskList = new ArrayList<Task>();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/tbs", "root", "root");
			
			Statement st= con.createStatement();
			ResultSet rs= st.executeQuery("SELECT * FROM tasInfo");
			while(rs.next())
			{
				Task task = new Task(rs.getInt("id"),rs.getString("name"),rs.getString("description"),rs.getDate("startDate"), rs.getDate("endDate"));
				taskList.add(task);
			}
			
			con.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return taskList;
	}
	
	
	public static Task getTaskById(int id)
	{		Task task = null;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/tbs", "root", "root");
			
			PreparedStatement ps= con.prepareStatement("SELECT * FROM taskInfo WHERE id = ?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				 task = new Task(rs.getInt("id"),rs.getString("name"),rs.getString("description"),rs.getDate("startDate"), rs.getDate("endDate"));
		
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return task;
	}
	
	
	public static int addProduct(Task task)
	{
		int status = 0;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/tbs", "root", "root");
			
			PreparedStatement ps= con.prepareStatement("INSERT INTO taskInfo VALUES(?,?,?,?,?)");
			ps.setInt(1, task.getTaskId());
			ps.setString(2, task.getTaskName());
			ps.setString(3, task.getTaskDescription());
			ps.setDate(4, (Date) task.getStart());
			ps.setDate(4, (Date) task.getEnd());
			status = ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	
	public static int updateTask(Task task)
	{
		int status = 0;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/tbs", "root", "root");
			
			PreparedStatement ps= con.prepareStatement("UPDATE taskInfo SET name=?, description=?, endDate=? WHERE id=?");
			ps.setString(1, task.getTaskName());
			ps.setString(2, task.getTaskDescription());
			ps.setDate(3, (Date) task.getEnd());
			ps.setInt(4, task.getTaskId());
			status = ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	
	public static int deleteProduct(int taskId)
	{
		int status = 0;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/tbs", "root", "root");
			
			PreparedStatement ps= con.prepareStatement("DELETE FROM taskInfo where id = ?");
			ps.setInt(1, taskId);
			status = ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
}