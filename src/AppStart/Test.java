package AppStart;


// 13.04.2018
// Selin Sakarya


import Controllers.LogInController;
import DataAccess.StaffRepository;
import Entities.CreativeStaff;
import Entities.StaffMember;

public class Test {
	
	public static void main(String[] args) {		
		
		LogInController logInController = new LogInController();		
		logInController.LogIn();	
		
	}

}
