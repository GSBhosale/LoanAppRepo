package com.bitlogic.LoanApplocation.service;

import java.util.List;

import com.bitlogic.LoanApplocation.model.LoanApp;

public interface loanService {

  public	LoanApp save(LoanApp la);

public List getData();

public void deleteData(int loanapId);

}
