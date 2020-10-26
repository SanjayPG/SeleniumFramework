package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import config.Settings;

public class DatabaseUtil {
	public static String connectionString = Settings.dbConnectionString;
	
	public static Connection fnOpen()
	{
		try {
			Class.forName(Settings.driverType).newInstance();			
			return DriverManager.getConnection(connectionString);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
				
	}
	
	public static void fnClose()
	{
		//Write Code
	}
	
	public static void fnExecuteQuery(String query,Connection connection)
	{
		Statement statement = null;
		try {
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	

}
