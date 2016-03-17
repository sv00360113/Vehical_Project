package com.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBHelper {
	public static Connection connect() throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		return DriverManager.getConnection("jdbc:oracle:thin:@172.16.154.10:1521:elp", "elp1131", "msat123$");
	}
}
