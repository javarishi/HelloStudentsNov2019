package com.learn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Properties;

public class DynamicWhereClause {
	
	private static String url =  "jdbc:mysql://localhost:3306/sakila";
	private static String userName = "root";
	private static String password = "password";
	private static String selectAllActors = "Select * from Actor Where actor_id > ? and first_name like ?";

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Properties props = new Properties();
			props.setProperty("user", userName);
			props.setProperty("password", password);
			Connection conn = DriverManager.getConnection(url, props);
			// Dynamic Value pass
			PreparedStatement pStat = conn.prepareStatement(selectAllActors);
			pStat.setInt(1, 100);
			pStat.setString(2, "A%");
			ResultSet rs = pStat.executeQuery();
		
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
					System.out.println(actorId + "  " + firstName + "  " + lastname + "  " + timestamp);
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
