package com.bitlogic.LoanApplocation.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitlogic.LoanApplocation.model.LoanApp;
import com.bitlogic.LoanApplocation.repositary.LoanRepositary;
import com.bitlogic.LoanApplocation.service.loanService;

@Service
public class loanServiceImpl implements loanService {

	@Autowired
	LoanRepositary lr;
	
	@Override
	public LoanApp save(LoanApp la) {
		// TODO Auto-generated method stub
		return lr.save(la);
	}

}
