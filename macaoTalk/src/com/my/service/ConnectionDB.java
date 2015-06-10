package com.my.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDB {

	String url = "jdbc:oracle:thin:@124.137.8.45:1521:XE";
	String user = "maccao";
	String password = "1q2w3e";	
	Connection con = null;

	public ConnectionDB() {

	}
	

	public Connection getCon() {
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	public void disConnect() {
		try {
			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

}
