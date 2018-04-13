package Boundaries;

import java.text.BreakIterator;
import java.util.Scanner;

import javax.lang.model.element.VariableElement;

import Controllers.LogInController;

public class LogInUI {
	
	private LogInController logInController;

	public LogInUI() {
		
	}
	
	public void welcome() {
		System.out.println("Welcome to Agate. Please log in");		
			
		String name, password;
		
		Scanner scanner = new Scanner(System.in);			
		System.out.println("name: ");
		name = scanner.nextLine();		
		System.out.println("password: ");
		password = scanner.next();
		
		logInController = new LogInController();
		logInController.authorize(name, password);
					
	}
	
	
	public void success() {
		System.out.println("success");				
	}
	
	public void error() {
		System.out.println("Wrong password");
		tryAgain();
				
	}
	
	public void userNotExist() {
		System.out.println("Sorry, there is no staff by that name");
		tryAgain();
	}
	
	private void tryAgain() {
		System.out.println("Retry? Y/N");
		Scanner scanner = new Scanner(System.in);
		if (scanner.nextLine().equals("y") || scanner.nextLine().equals("Y")) {
			welcome();
		}
		else {
			
		}
	}

}
