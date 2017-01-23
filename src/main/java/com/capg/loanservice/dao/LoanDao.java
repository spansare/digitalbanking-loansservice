package com.capg.loanservice.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.capg.loanservice.model.Customer;
import com.capg.loanservice.model.Loan;

@Repository
@Transactional
public interface LoanDao extends CrudRepository<Loan, Long> {
	
	public List<Loan> findByCustomer(Customer customer);
	public Loan findByLoanAccountId(int loanAccountId);
}
