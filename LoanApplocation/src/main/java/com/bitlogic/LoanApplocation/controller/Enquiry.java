package com.bitlogic.LoanApplocation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bitlogic.LoanApplocation.model.LoanApp;
import com.bitlogic.LoanApplocation.service.loanService;

@RestController
public class Enquiry {

	@Autowired 
	loanService ls;

	@PostMapping("/save")
	public LoanApp save(@RequestBody LoanApp la)
	{
		return ls.save(la);
	}
	@GetMapping("/view")
	public List<LoanApp> getdata()
	{
		List al=ls.getData();
		return al;
	}
}
