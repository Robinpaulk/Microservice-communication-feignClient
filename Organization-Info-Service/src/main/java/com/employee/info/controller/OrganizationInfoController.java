package com.employee.info.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.info.model.OrganizationInfo;
import com.employee.info.model.Branch;

@RestController
@RequestMapping("/api")
public class OrganizationInfoController {
	
	@Autowired
	private LocationServiceProxy locationProxy;
	
	@GetMapping(produces="application/json")
	public OrganizationInfo getOrganizationInfo() {
		List<Branch> branch = locationProxy.listAllBranches();
		return new OrganizationInfo("Apple Inc", "apple@gmail.com", 1976, 87655553, branch);
	}
}
