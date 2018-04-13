package Entities;

import java.util.Date;

public class CreativeStaff extends StaffMember {

	
	public CreativeStaff(int id, String name, Date startDate, String emailAddress, String password) {
		super(id, name, startDate, emailAddress, password);		
	}
	
	public CreativeStaff(int id, String name, Date startDate, String emailAddress) {
		super(id, name, startDate, emailAddress);		
	}

	@Override
	public void doJob() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
