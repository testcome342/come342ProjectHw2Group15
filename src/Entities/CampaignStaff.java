package Entities;

import java.util.Date;

public class CampaignStaff extends StaffMember {
	

	public CampaignStaff(int id, String name, Date startDate, String emailAddress, String password) {
		super(id, name, startDate, emailAddress, password);
		// TODO Auto-generated constructor stub
	}

	public CampaignStaff(int id, String name, Date startDate, String emailAddress) {
		super(id, name, startDate, emailAddress);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doJob() {
		// TODO Auto-generated method stub

	}
	

}
