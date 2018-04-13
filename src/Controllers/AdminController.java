package Controllers;

import Boundaries.AdminUI;

public class AdminController {

	private AdminUI adminUI;
	
	public AdminController() {
		adminUI = new AdminUI();
	}
	
	public void home(String staffName) {
		adminUI.home(staffName);
	}
	
}
