package com.jyoti.company.controller;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jyoti.company.model.Company;
import com.jyoti.company.model.CompanyModel;

@RestController
@RequestMapping("/company")
public class CompanyController {
	
	@Autowired
	private CompanyModel model;
	
	@GetMapping("/details")
	@Produces(MediaType.APPLICATION_JSON)
	public Company getCompanyDetails() {
		model.setCompanyName("IBM");
		model.setEstablishment_year("1965");
		model.setOwner("Great Person");
		model.setIsoCertified("Y");
		
		Company company = new Company();
		company.setCompany(model);
		return company;
		
	}
	@RequestMapping("/name")
	public String getCompanyName() {
		return "IBM";
		
	}

}
