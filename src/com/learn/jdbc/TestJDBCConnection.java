package com.learn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Properties;


public class TestJDBCConnection {

	private static String url =  "jdbc:mysql://localhost:3306/sakila";
	private static String userName = "root";
	private static String password = "password";
	private static String selectAllActors = "Select * from Actor";
	
	
	public static void main(String[] args) {
		
		try {
			// Step 1. Driver
			//Driver mysqlDriver = new Driver();
			// Step 2 DriverManager
			//DriverManager.registerDriver(mysqlDriver);
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Step 3 - Connection
			// URL (IP/ port/ name / scema ) - UserName - Password
			
			
			Properties props = new Properties();
			props.setProperty("user", userName);
			props.setProperty("password", password);
			Connection conn = DriverManager.getConnection(url, props);
			// Step 4: Statement
			Statement stat = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, 
								ResultSet.CONCUR_UPDATABLE);
			// Step 5: Get the results
			ResultSet rs = stat.executeQuery(selectAllActors);
			if(rs != null) {
				String firstName = null;
				String lastname = null;
				Timestamp timestamp = null;
				int actorId = 0;
				while(rs.next()) {
					actorId = rs.getInt("actor_id");
					firstName = rs.getString("first_name");
					lastname = rs.getString("last_name");
					timestamp = rs.getTimestamp("last_update");
					System.out.println(rs.getRow() +  "  " + actorId + "  " + firstName + "  " + lastname + "  " + timestamp);
					if(actorId == 301) {
						rs.updateString("first_name", firstName.toUpperCase());
						rs.updateString("last_name", lastname.toUpperCase());
						rs.updateRow();
					}
				}
			}
			conn.close();
			// Step 6 - in case of issues - SQLException
		}catch(SQLException sqlEx) {
			sqlEx.printStackTrace();
		}catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		}

	}

}
