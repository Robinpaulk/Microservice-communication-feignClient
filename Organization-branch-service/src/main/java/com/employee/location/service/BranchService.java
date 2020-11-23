package com.employee.location.service;

import java.util.List;

import com.employee.location.model.Branch;

public interface BranchService {
	
	List<Branch> getLocations();
	
	Branch saveLocation(Branch location);
}
