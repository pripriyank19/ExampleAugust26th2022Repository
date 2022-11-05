package com.sgtesting.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class JDBCConnection {

	public static void main(String[] args) {
		getData();
	}
	
	public static void getData()
	{
		Connection connection=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Connection succesful");
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
			Statement stmt=connection.createStatement();
			ResultSet rs=stmt.executeQuery("select * from students");
			ResultSetMetaData rsmd=rs.getMetaData();
			System.out.printf("%-12s",rsmd.getColumnName(1));
			System.out.printf("%-12s",rsmd.getColumnName(2));
			System.out.printf("%-12s",rsmd.getColumnName(3));
			System.out.printf("\n");

			while(rs.next())
			{
				System.out.printf("%-12s",rs.getString("ID"));
				System.out.printf("%-12s",rs.getString("NAME"));
				System.out.printf("%-12s",rs.getString("BRANCH"));
				System.out.printf("\n");
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				connection.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
