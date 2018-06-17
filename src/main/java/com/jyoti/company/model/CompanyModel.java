package com.jyoti.company.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class CompanyModel {
	private String companyName;
	private String owner;
	private String establishment_year;
	private String isoCertified;

}
