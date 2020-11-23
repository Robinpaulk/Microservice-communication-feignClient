package com.employee.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.location.model.Branch;
import com.employee.location.service.BranchService;

@RestController
@RequestMapping("/api")
public class BranchController {
	
	@Autowired
	private BranchService locService;
	
	
	@GetMapping("/branches")
	public List<Branch> listAllBranches() {
		return locService.getLocations();
	}
	
	@PostMapping("/branches")
	public Branch saveBranches(@RequestBody Branch location) {
		return locService.saveLocation(location);
	}
}
