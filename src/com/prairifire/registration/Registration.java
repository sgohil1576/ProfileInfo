package com.prairifire.registration;

import java.sql.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Registration {

	public static void main(String[] args) throws IOException, SQLException {
		DBAConnection conn = new DBAConnection();
		conn.CreateConnection();
		profile();
		
	}
			
	
	 public static void profile() throws IOException, SQLException {
		Scanner registration = new 	Scanner(System.in); 

		int choice;

        int create = 1;
        int update = 2;
        int delete = 3;

        System.out.println("Registration of members:");
        System.out.println("1. Create Profile");
        System.out.println("2. Update Profile");
        System.out.println("3. Delete Profile");
        
        choice = registration.nextInt();

        if (choice == 1) {
            choice = create;
        } else if (choice == 2) {
            choice = update;
        } else if (choice == 3) {
            choice = delete;
        } else if (choice > 3 || choice < 1) {
            System.out.println("Try again.");
            choice = -1;
            profile();
        }
        CreateProfile cr = new CreateProfile();
         cr.create();
        
	 }
}



	