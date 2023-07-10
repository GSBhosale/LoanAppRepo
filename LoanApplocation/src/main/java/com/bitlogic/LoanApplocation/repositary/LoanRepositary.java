package com.bitlogic.LoanApplocation.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bitlogic.LoanApplocation.model.LoanApp;

@Repository
public interface LoanRepositary extends JpaRepository<LoanApp, Integer> {

}
