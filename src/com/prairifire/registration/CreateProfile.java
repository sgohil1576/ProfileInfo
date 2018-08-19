package com.prairifire.registration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.*;

public class CreateProfile {

	public static void main(String[] args) throws IOException {
		
		create();
	}
		public static void create() throws IOException {
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

		System.out.println("Registration successfull");
	    }
		

	private static String getInput() {
		// TODO Auto-generated method stub
		return null;
	}

	
}

