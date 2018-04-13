package FakeDB;


import java.util.ArrayList;
import java.util.List;

import Entities.*;

public class StaffTable {

	
	private List<StaffMember> staffs;
	
	public StaffTable() {		
		staffs = new ArrayList<>();			
		StaffMember staff1 = new AdminStaff(1, 
				
				"selin", null, "selin@mail.com", "asd");	
		StaffMember staff2 = new CreativeStaff(2, 
				"teststaff", null, "deneme@mail.com", "asd");		
		
		staffs.add(staff1);
		staffs.add(staff2);
	}
		
	public List<StaffMember> getAllStaff() {
		return staffs;
	}
	
}
