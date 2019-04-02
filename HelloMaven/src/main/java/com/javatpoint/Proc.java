package com.javatpoint;

import java.sql.*;  
public class Proc {  
public static void main(String[] args) throws Exception{  
  
Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@localhost:1521:xe","deepak","deep");  
  
CallableStatement stmt=con.prepareCall("{call myprocedure(?,?,?)}");  
stmt.setInt(1,1011);  
stmt.setString(2,"Amit");  
stmt.setInt(3, 15000);
stmt.execute();  
  
System.out.println("success");  
}  
}  
