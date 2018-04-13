package Entities;

import java.util.List;

public class Client {

	private int id;
	private String companyName;
	private String companyAddress;
	private String companyEmail;	
	private CreativeStaff staffContact;
	private List<Campaign> campaigns;
	
	
	public Client(String companyName, String companyAddress, String companyEmail) {
		super();
		this.companyName = companyName;
		this.companyAddress = companyAddress;
		this.companyEmail = companyEmail;
	}
	
	public void assignStaffContact(CreativeStaff creativeStaff) {
		this.staffContact = creativeStaff;
	}

	public void addNewCampaign(Campaign campaign) {
		this.campaigns.add(campaign);
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getCompanyEmail() {
		return companyEmail;
	}

	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}

	public CreativeStaff getStaffContact() {
		return staffContact;
	}

	public void setStaffContact(CreativeStaff staffContact) {
		this.staffContact = staffContact;
	}

	public List<Campaign> getCampaigns() {
		return campaigns;
	}

	public void setCampaigns(List<Campaign> campaigns) {
		this.campaigns = campaigns;
	}
	
	
	
	
	
	
	
}
