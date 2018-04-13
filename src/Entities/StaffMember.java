package Entities;

import java.util.Date;

public abstract class StaffMember {

	protected int id;
	protected String name;
	protected Date startDate;
	protected String emailAddress;
	protected String password;
	
	
	public StaffMember(int id, String name, Date startDate, String emailAddress, String password) {
		super();
		this.id = id;
		this.name = name;
		this.startDate = startDate;
		this.emailAddress = emailAddress;
		this.password = password;
	}
	
	public StaffMember(int id, String name, Date startDate, String emailAddress) {
		super();
		this.id = id;
		this.name = name;
		this.startDate = startDate;
		this.emailAddress = emailAddress;
	}
	


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "StaffMember [id=" + id + ", name=" + name + ", startDate=" + startDate + ", emailAddress="
				+ emailAddress + "]";
	}
	
	public abstract void doJob();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	
	
	
	
	
	
}
