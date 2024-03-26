package com.javaJdbcandAPIConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection 
{

	//database credentials
	private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/departments";
	private static final String DATABASE_USERNAME= "root";
	private static final String DATABASE_PASSWORD= "20BQ1a4726@";
	
	 public static Connection getDBConnection() throws SQLException
	 {
		 Connection connection = null;
		 try
		 {
			//step1:load/register with driver 
			Class.forName(DRIVER_NAME);	
			//step2: create connection object 
			connection = DriverManager.getConnection(DATABASE_URL,DATABASE_USERNAME,DATABASE_PASSWORD);
			
		 }
		 catch (Exception e) {
			// TODO: handle exception
			 e.printStackTrace();
		}
		 
		 return connection;
	}
	
	
	
}
