package com.employee.location.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.location.model.Branch;
import com.employee.location.repository.BranchRepository;
@Service
public class BranchServiceImpl implements BranchService{

	@Autowired
	private  BranchRepository locationrepo;
	@Override
	public List<Branch> getLocations() {
		return locationrepo.findAll();
	}

	@Override
	public Branch saveLocation(Branch location) {
		return locationrepo.save(location);
	}

}
