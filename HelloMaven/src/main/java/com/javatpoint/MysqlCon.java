package com.javatpoint;

import java.sql.*;

class MysqlCon {
	public static void main(String args[]) throws SQLException {
		System.out.println("hello");
		Statement stmt=null;
		ResultSet rs=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", "root", "deepak");
			// here sonoo is database name, root is username and password
			System.out.println("ji");
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from emp");
			System.out.println("khkhkhk");
			while (rs.next())
			
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
		 rs.close();
		 //con.close();
		}
	}
}