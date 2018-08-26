package com.prairifire.registration;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBAConnection {
public DBAConnection() {
	System.out.println("DB Connection class opened");
}

public static Connection CreateConnection() {
	Connection conn = null;
	 try{  
			Class.forName("com.mysql.jdbc.Driver");  
		
	conn =DriverManager.getConnection(  
			"jdbc:mysql://127.0.0.1:3306/ProfileInformation","root","root"); 
		
 	String sql = "INSERT INTO registration (userID, firstName, middleName, lastName, address, phoneNumber, emailID, zipCode, birthDate, height, weight, bloodGroup, homeTown, maritalStatus)"
 	+ "VALUES ('userID', 'firstName', 'middleName', 'lastName', 'address', 'phoneNumber', 'emailID', 'zipCode', 'birthDate', 'height', 'weight', 'bloodGroup', 'homeTown', 'maritalStatus')";
		
	System.out.println("Connection created successfully");
						
		}
		catch(Exception e){
			System.out.println(e);}  
	 
	 return conn;
	 
		}  
     



}
