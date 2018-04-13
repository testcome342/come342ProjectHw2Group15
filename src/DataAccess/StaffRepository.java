package DataAccess;

import java.util.List;

import Entities.StaffMember;
import FakeDB.StaffTable;

public class StaffRepository implements IRepository<StaffMember> {

	private StaffTable staffTable;
	
	public StaffRepository() {
		staffTable = new StaffTable();
	}

	@Override
	public StaffMember getById(int id) {
		for (StaffMember staffMember : staffTable.getAllStaff()) {
			if (staffMember.getId() == id) {
				return staffMember;
			}
		}
		return null;
		
	}
	
	public StaffMember getByName(String name) {
		for (StaffMember staffMember : staffTable.getAllStaff()) {
			if (staffMember.getName().equals(name)) {
				return staffMember;
			}
		}
		return null;
	}
	
	@Override
	public List<StaffMember> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Add(StaffMember staffMember) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Remove(int id) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
}
