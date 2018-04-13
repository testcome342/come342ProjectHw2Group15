package Controllers;

import Boundaries.AdminUI;
import Boundaries.CreativeStaffUI;
import Boundaries.LogInUI;
import DataAccess.StaffRepository;
import Entities.StaffMember;

public class LogInController {
	
	private LogInUI logInUI;
	private AdminController adminController;
	private CreativeStaffController creativeStaffController;
	private StaffRepository staffRepository;
	
	public LogInController() {
		logInUI = new LogInUI();
		staffRepository = new StaffRepository();
		adminController = new AdminController();
		creativeStaffController = new CreativeStaffController();
	}
	
	public void LogIn() {
		logInUI.welcome();
	}
	
	public void authorize(String name, String password) {
			
		StaffMember staffMember = staffRepository.getByName(name);
		
		if (staffMember==null) {
			logInUI.userNotExist();	
		}			
		
		if (password.equals(staffMember.getPassword())) {	
						
			switch (staffMember.getClass().getName()) {
			case "Entities.AdminStaff":
				adminController.home(staffMember.getName());
				break;
			case "Entities.CreativeStaff":
				creativeStaffController.home();
			default:
				break;
			}		
		}
		else {
			logInUI.error();		
		}
		
	}

}
