package com.javaJdbcandAPIConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SaveDepartment {

	public static void main(String[] args) throws SQLException
	{
		// TODO Auto-generated method stub
		Connection connection = null;
		
		try
		 {	
			connection = DatabaseConnection.getDBConnection();
			
			Statement statement = connection.createStatement();
			
			Department department1 = new Department(01,"CSE");
			Department department2 = new Department(02,"ECE");
			Department department3 = new Department(03,"EEE");
			
			String query = "insert into department(department_id,department_name)values('"+department3.getDepartment_Id()+"','"+department3.getDepartment_Name()+"')"; 
			
			int status=  statement.executeUpdate(query);
			
			System.out.println(status+"customer object stored in database table");
			
		 }
		 catch (Exception e) {
			// TODO: handle exception
			 e.printStackTrace();
		}
		finally 
		{
			connection.close();
		}
	}

}
