package com.prairifire.registration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.*;

public class Registration {

	public static void main(String[] args) throws IOException {
		
		
		
		Scanner scan = new Scanner(System.in);
		
		String[] myStringArray;
	 	myStringArray = new String[] {"firstName", "middleName", "lastName", "address", "emailID", "bloodGroup", "homeTown", "maritalStatus", "userID", "phoneNumber", "zipCode", "birthDate", "height", "weight"}; 
		
		  
	 	HashMap<String, String> map = new HashMap<String, String>();
	 	HashMap<String, HashMap<String, String>> OuterMap;
	 	OuterMap = new HashMap<String, HashMap<String, String>>();
	 	
	 	HashMap<String, String> val = new HashMap<String, String>();
	 	OuterMap.put("myKey", val);
	 	
	 // Iterating over keys only
	 // for (HashMap key : map.keySet()) {
	 //  System.out.println("Key = " + key);
	 // }

	 // Iterating over values only
	// for (String value : map.values()) {
	//     System.out.println("Value = " + value);
	// }
	 	
	//	  HashMap<String, String> map = new HashMap<String, String>();
	//	  for (Map.Entry<String, String> entry : map.entrySet()) {
	//	      System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
	//	  }
		  
	 	
		//  HashMap<String,ArrayList<HashMap<String, String>>> multiMap = new HashMap<>();
		  
	//	  HashMap<String, HashMap<String, String>> map_of_maps;
	//	  map_of_maps = new HashMap<String, HashMap<String, String>>();
		  
	//	  HashMap<String, String> val1 = new HashMap<String, String>();
		//  map_of_maps.put("key1", val1);
		  
		 	
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

	
}

