package com.learn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Properties;

public class InsertAndUpdate {
	
	private static String url =  "jdbc:mysql://localhost:3306/sakila";
	private static String userName = "root";
	private static String password = "password";
	private static String insertQuery =
		 "Insert into Actor (actor_id, first_name, last_name, last_update)"
				+ " values (?,?,?, CURRENT_TIMESTAMP) ";
	
	private static String updateQuery = " Update Actor set first_name = ? where actor_id = ?";
	private static String deleteQuery = "Delete from Actor where actor_id = ?"; // Home Work

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Properties props = new Properties();
			props.setProperty("user", userName);
			props.setProperty("password", password);
			conn = DriverManager.getConnection(url, props);
			conn.setAutoCommit(false);
			// Dynamic Value pass
			/*
			PreparedStatement pStat = conn.prepareStatement(insertQuery);
			pStat.setInt(1, 301);
			pStat.setString(2, "Niel");
			pStat.setString(3, "ArmStrong"); */
			
			PreparedStatement pStat = conn.prepareStatement(updateQuery);
			pStat.setString(1, "David");
			pStat.setInt(2, 155);
			
			int rowsaffected = pStat.executeUpdate();
			System.out.println("Insert/Update Successful :: " + rowsaffected);
			conn.commit();
			conn.close();
			// Step 6 - in case of issues - SQLException
		}catch(SQLException sqlEx) {
			conn.rollback();
			sqlEx.printStackTrace();
		}catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		}

	}

}
