package com.employee.info.controller;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.employee.info.model.Branch;


@FeignClient(name="branch-service")
public interface LocationServiceProxy {
	
	@GetMapping(path="/api/branches" , produces="application/json")
	List<Branch> listAllBranches();
}
