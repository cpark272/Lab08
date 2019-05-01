package co.grandcircus;

import java.util.Scanner;

import java.util.InputMismatchException;

public class Lab08Program {

	public static void main(String[] args) {
		
		// Initializes Scanner class for user input
		Scanner scan = new Scanner(System.in);
		
		// Initializes String program to null
		String userInput = null;
		
		// Initializes studentNumber
		int studentNumber = 0;
		
		// Initializes studentID
		int studentID = 0;
		
		// Title of program
		System.out.print("Welcome to our Java class. ");
		
		// Array of student first names 1 to 6
		String[] studentFirstNameList = {"Chan", "Will", "Tom", "Brad", "Ian", "Nick"};
		
		// Array of student last names 1 to 6
		String[] studentLastNameList = {"Park", "Smith", "Hanks", "Pitt", "Malcolm", "Fury"};		
		
		// Array of hometowns of students 1 to 6
		String[] studentHometownList = {"Ann Arbor, MI", "Detroit, MI", "Grand Rapids, MI", "Troy, MI", "Battle Creek, MI", "Lansing, MI"};
		
		// Array of favorite foods of students 1 to 6
		String[] studentFavoriteFoodList = {"coffee", "lasagna", "cookies", "cake", "hamburger", "hot dog"};
		
		// Do-while loop to let user decide to continue or end the program
		do {
			
			// Prompts user to enter a student number
			System.out.print("Which student would you like to learn more about? (enter a number 1-6): ");
			studentNumber = scan.nextInt();
			// Calculates student ID based on user input of integer
			studentID = studentNumber - 1;
			
			// Retrives first name from the array of student names
			String studentFirstName = studentFirstNameList[studentID];
			// Retrives last name from the array of student names
			String studentLastName = studentLastNameList[studentID];
			// Outputs student name from array of student names
			System.out.print("\nStudent " + studentNumber + " is " + studentFirstName + " " + studentLastName + ".");
			
			// Garbage line
			scan.nextLine();
			
			// Prompts user to enter String "hometown" or "favorite food"
			System.out.print(" What would you like to know about " + studentFirstName + "? (enter or \"hometown\" or \"favorite food\"): ");
			String studentInfo = scan.next();
			
			// if-else statement to determine if user asks for hometown or favorite food of student from previous prompt
			if (studentInfo.equals("hometown")) {
				// Retrives hometown of student 
				String studentHometown = studentHometownList[studentID];
				// Outputs hometown of student
				System.out.print("\n" + studentFirstName + " is from " + studentHometown + ".");		
			} else {
				// Retrieves favorite food of student
				String studentFavoriteFood = studentFavoriteFoodList[studentID];
				// Outputs favorite food of student
				System.out.print("\n" + studentFirstName + " likes " + studentFavoriteFood + ".");
			}
			
			//scan.reset();
			// Garbage line
			scan.nextLine();
						
			// Prompts user to ask if they want know more
			System.out.print(" Would you like to know more? (enter \"yes\" or \"no\"): ");
			userInput = scan.next();
			System.out.println();
			
		} while (userInput.equals("yes"));

		// End of program
		System.out.println("Thanks!");

		scan.close();

	}

}
