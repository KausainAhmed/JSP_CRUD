package com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentDao {
	public static Connection conn() throws ClassNotFoundException, SQLException {
		Connection conn;
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JSP", "root", "open6162");
		return conn;
	}
}
