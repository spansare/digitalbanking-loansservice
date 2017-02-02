package com.capg.loanservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.capg.loanservice.dao.BranchDao;
import com.capg.loanservice.dao.LoanDao;
import com.capg.loanservice.model.Customer;
import com.capg.loanservice.model.Loan;
import com.capg.loanservice.service.LoanService;

@Component
@Service
public class LoanServiceImpl implements LoanService{

	@Autowired
	private BranchDao branchDao;
	
	@Autowired
	private LoanDao loanDao;
	
	@Override
	public List<Loan> getLoans(Customer customer) {
		return loanDao.findByCustomer(customer);
	}

	@Override
	public Loan getLoanById(int loanAccountId) {
		return loanDao.findByLoanAccountId(loanAccountId);
	}
}
