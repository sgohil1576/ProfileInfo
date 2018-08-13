package com.prairifire.registration;

import java.util.Scanner;
import java.io.*;

public class Registration {

	public static void main(String[] args) throws IOException {
		
		
		
		Scanner scan = new Scanner(System.in);
		
		String[] myStringArray;
	 	myStringArray = new String[] {"firstName", "middleName", "lastName", "address", "emailID", "bloodGroup", "homeTown", "maritalStatus", "userID" ,"phoneNumber", "zipCode", "birthDate", "height", "weight"};
	
	 	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	 	
	 	PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.txt"));
	 	out.println(myStringArray);
	 	out.close();
{
System.out.println(myStringArray);
}
			String firstName = "Jai";
			String middleName= "";
			String lastName= "";
			String address= "";
			String emailID= "";
			String bloodGroup= "";
			String homeTown= "";
			String maritalStatus= "smit";

			String userID= "";
			String phoneNumber= "";
			String zipCode= ""; 
			String birthDate= "";
			String height= "";
			String weight= "";

		System.out.println("Enter your userID:");
		userID = scan.nextLine();

		System.out.println("Enter your First Name: ");
		firstName = scan.nextLine();

		System.out.println("Enter your Middle Name: ");
		middleName = scan.nextLine();

		System.out.println("Enter your Last Name: ");
		lastName = scan.nextLine();

		System.out.println("Enter your Address:");
		address = scan.nextLine();

		System.out.println("Enter your Phone Number:");
		phoneNumber = scan.nextLine();

		System.out.println("Enter your Email ID:");
		emailID = scan.nextLine();

		System.out.println("Enter your Zip Code:");
		zipCode = scan.nextLine();

		System.out.println("Enter your BirthDate:");
		birthDate = scan.nextLine();

		System.out.println("Enter your Height:");
		height = scan.nextLine();

		System.out.println("Enter your Weight:");
		weight = scan.nextLine();

		System.out.println("Enter your Blood Group:");
		bloodGroup = scan.nextLine();

		System.out.println("Enter your Hometown:");
		homeTown = scan.nextLine();

		System.out.println("Enter your Marital Status:");
		maritalStatus = scan.nextLine();

		System.out.println("Registration successfull");
	
	}

	private static String InputStreamReader() {
		// TODO Auto-generated method stub
		return null;
	}

}
