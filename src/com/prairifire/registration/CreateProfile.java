package com.prairifire.registration;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CreateProfile {

	public static void main(String[] args) throws IOException, SQLException {
		
		create();
	}
		public static void create() throws IOException, SQLException {
		Scanner scan = new Scanner(System.in);
		
	    
		String[] myStringArray;
		myStringArray = new String[] {"firstName", "middleName", "lastName", "address", "emailID", "bloodGroup", "homeTown", "maritalStatus", "userID", "phoneNumber", "zipCode", "birthDate", "height", "weight"}; 
		
		  
	 	HashMap<String, String> map = new HashMap<String, String>();
	
	
			String firstName = "";
			String middleName= "";
			String lastName= "";
			String address= "";
			String emailID= "";
			String bloodGroup= "";
			String homeTown= "";
			String maritalStatus= "";
			String userID= "";
			String phoneNumber= "";
			String zipCode= ""; 
			String birthDate= "";
			String height= "";
			String weight= "";

		

			
		System.out.println("Enter your userID:");
		userID = scan.nextLine();
		map.put("userId", userID);

		System.out.println("Enter your First Name: ");
		firstName = scan.nextLine();
		map.put("firstName", firstName);

		System.out.println("Enter your Middle Name: ");
		middleName = scan.nextLine();
		map.put("middleName", middleName);

		System.out.println("Enter your Last Name: ");
		lastName = scan.nextLine();
		map.put("lastName", lastName);

		System.out.println("Enter your Address:");
		address = scan.nextLine();
		map.put("address", address);

		System.out.println("Enter your Phone Number:");
		phoneNumber = scan.nextLine();
		map.put("phoneNumber", phoneNumber);

		System.out.println("Enter your Email ID:");
		emailID = scan.nextLine();
		map.put("emailID", emailID);

		System.out.println("Enter your Zip Code:");
		zipCode = scan.nextLine();
		map.put("zipCode", zipCode);

		System.out.println("Enter your BirthDate:");
		birthDate = scan.nextLine();
		map.put("birthDate", birthDate);

		System.out.println("Enter your Height:");
		height = scan.nextLine();
		map.put("height", height);

		System.out.println("Enter your Weight:");
		weight = scan.nextLine();
		map.put("weight", weight);

		System.out.println("Enter your Blood Group:");
		bloodGroup = scan.nextLine();
		map.put("bloodGroup", bloodGroup);

		System.out.println("Enter your Hometown:");
		homeTown = scan.nextLine();
		map.put("homeTown", homeTown);

		System.out.println("Enter your Marital Status:");
		maritalStatus = scan.nextLine();
		map.put("maritalStatus", maritalStatus);
		
		

		System.out.println(Arrays.asList(map));
		
		PrintWriter out = new PrintWriter(new FileWriter("ProfileInfo.txt"));
	 	out.println(Arrays.asList(map));
	 	out.close();
	 	
	 	String sql = "INSERT INTO registration (userID, firstName, middleName, lastName, address, phoneNumber, emailID, zipCode, birthDate, height, weight, bloodGroup, homeTown, maritalStatus)"
	 	+ "VALUES ('userID', 'firstName', 'middleName', 'lastName', 'address', 'phoneNumber', 'emailID', 'zipCode', 'birthDate', 'height', 'weight', 'bloodGroup', 'homeTown', 'maritalStatus')";
	 	
	 	Connection conn = null;
		PreparedStatement stmt = conn.prepareStatement(sql);
	 
	 	stmt.setString(1, userID);
	 	stmt.setString(2, firstName);
	 	stmt.setString(3, middleName);
	 	stmt.setString(4, lastName);
	 	stmt.setString(5, address);
	 	stmt.setString(6, phoneNumber);
	 	stmt.setString(7, emailID);
	 	stmt.setString(8, zipCode);
	 	stmt.setString(9, birthDate);
	 	stmt.setString(10, height);
	 	stmt.setString(11, weight);
	 	stmt.setString(12, bloodGroup);
	 	stmt.setString(13, homeTown);
	 	stmt.setString(14, maritalStatus);

	 	int count = stmt.executeUpdate(sql);
	 	System.out.println("Number of rows updated in database =  " + count);
 	
	 	//Query
		
	 	System.out.println("Registration successfull");
	    }
		

	private static String getInput() throws IOException {
		 String input = getInput();
         BufferedWriter writer = new BufferedWriter(new FileWriter(new File("ProfileInfo")));
         writer.write(input,0,input.length());
         writer.close();
    
		return null;
		
	}

	
}

