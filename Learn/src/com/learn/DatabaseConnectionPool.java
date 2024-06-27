package com.learn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionPool {

	private static DatabaseConnectionPool instance;
	private Connection connection;
	
	private DatabaseConnectionPool() {
		try {
			connection=DriverManager.getConnection("\"jdbc:mysql://localhost:3306/mydatabase\", \"username\", \"password\"");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//get the instance first
	public static DatabaseConnectionPool getInstance() {
		if(instance==null) {
			instance=new DatabaseConnectionPool();
		}
		return instance;
	}
	//get the connection
	public Connection getConnection() {
		return connection;
	}
	
	public void executeQuery(String query) {
        System.out.println("Connected "+query);
    }
}
