package Boundaries;

import java.util.Scanner;

public class AdminUI {

	public void home(String staffName) {
		System.out.println("Welcome " + staffName +". Choose an action: ");
		
		presentOptions();
		
		Scanner scanner = new Scanner(System.in);
		
		switch (scanner.nextInt()) {		
		case 1:
			
			break;

		case 2:
			break;
			
		case 3:
			break;
			
		case 4:
			break;
			
		case 5:
			break;

		default:
			System.out.println("Please enter a valid number");
			presentOptions();
			break;
		}

	}
	
	private void presentOptions() {
		System.out.println("(1) Add a new client");
		System.out.println("(2) Assign staff to work on a campaign");
		System.out.println("(3) Assign a staff contact");
		System.out.println("(4) Add a new staff grade");
		System.out.println("(5) Change the grade for a member of staff");
	}

	
}
