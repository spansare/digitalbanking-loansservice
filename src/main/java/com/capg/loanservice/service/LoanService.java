package com.capg.loanservice.service;

import java.util.List;

import com.capg.loanservice.model.Branch;
import com.capg.loanservice.model.Customer;
import com.capg.loanservice.model.Loan;

public interface LoanService {
	
	public List<Loan> getLoans(Customer customer);
	public Loan getLoanById(int loanAccountId);
}
