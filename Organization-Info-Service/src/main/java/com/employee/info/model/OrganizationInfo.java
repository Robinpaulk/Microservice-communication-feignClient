package com.employee.info.model;

import java.util.List;

public class OrganizationInfo {
	
	private String organizationName;
	private String organizationEmail;
	private int established;
	private long organizationNumber;
	private List<Branch> branch;
	
	public OrganizationInfo() {
		
	}

	public OrganizationInfo(String organizationName, String organizationEmail, int established,
			long organizationNumber, List<Branch> branch) {
		super();
		this.organizationName = organizationName;
		this.organizationEmail = organizationEmail;
		this.established = established;
		this.organizationNumber = organizationNumber;
		this.branch = branch;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getOrganizationEmail() {
		return organizationEmail;
	}

	public void setOrganizationEmail(String organizationEmail) {
		this.organizationEmail = organizationEmail;
	}

	public int getEstablished() {
		return established;
	}

	public void setEstablished(int established) {
		this.established = established;
	}

	public long getOrganizationNumber() {
		return organizationNumber;
	}

	public void setOrganizationNumber(long organizationNumber) {
		this.organizationNumber = organizationNumber;
	}

	
	public List<Branch> getBranch() {
		return branch;
	}

	public void setBranch(List<Branch> branch) {
		this.branch = branch;
	}
	
	
	
	
	
}
