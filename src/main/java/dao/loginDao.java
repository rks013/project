

package dao;
import java.sql.*;

import com.loginInfo;

public class loginDao {
	static Connection con = null;

	public static boolean isUserValid(loginInfo userDetails)
	{
		boolean validStatus = false;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/tbs", "root", "root");
			
			
			Statement st= con.createStatement();
			ResultSet rs= st.executeQuery("SELECT * FROM login_info WHERE user_name = '"+userDetails.getUserName()+"' AND password = '"+userDetails.getPassword()+"'");
			while(rs.next())
			{
				validStatus = true;
			}
			
			con.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return validStatus;
	}
	
}