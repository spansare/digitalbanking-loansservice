package com.capg.loanservice.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.capg.loanservice.dao.LoanDao;
import com.capg.loanservice.model.Customer;
import com.capg.loanservice.model.Loan;
import com.capg.loanservice.service.impl.LoanServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class LoanServiceTest {
	
	@InjectMocks
	private LoanService loanService= new LoanServiceImpl();
	
	@Mock
	LoanDao loanDAO;

	@Before
    public void setup() {
        // Process mock annotations
        MockitoAnnotations.initMocks(this);
	}
	
	/**
	 * To get all the loans of a customer
	 */	
	@Test
	public void testGetLoans() {
		Customer customer=new Customer();
	    customer.setCustomerId(123456);
	    
		List<Loan> loanList = new ArrayList<Loan>();
		Loan l1 = new Loan();
		l1.setLoanAccountNumber("HL-1234");
		l1.setAmount(123456.78);
		loanList.add(l1);
		
		// define return value for method getLoans()
		when(loanDAO.findByCustomer(customer)).thenReturn(loanList);
		
		loanList = loanService.getLoans(customer);
		
		assertNotNull(loanList);
		// use mock in test....
		assertEquals(loanDAO.findByCustomer(customer), loanList);
	}

	/**
	 * To get loan details for the given loan account number
	 */	
	@Test
	public void testGetLoanById() {
	    
		Loan loan = new Loan();
		loan.setLoanAccountNumber("PL-1234");
		loan.setAmount(123456.78);
		
		// define return value for method getLoans()
		when(loanDAO.findByLoanAccountId(123)).thenReturn(loan);
		
		loan = loanService.getLoanById(anyInt());
		
		// use mock in test...
		//TODO loan account number is string here.
		assertEquals(loanDAO.findByLoanAccountId(anyInt()), loan);
	}
}
