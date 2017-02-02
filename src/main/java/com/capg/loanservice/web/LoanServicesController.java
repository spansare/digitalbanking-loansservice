package com.capg.loanservice.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capg.loanservice.model.Customer;
import com.capg.loanservice.model.Loan;
import com.capg.loanservice.service.LoanService;

@RestController
@ComponentScan("com.capg.loanservice")

@EnableAutoConfiguration
public class LoanServicesController {

	@Autowired
	private LoanService loanService;
	
	@CrossOrigin
	@RequestMapping(value="/loanservices/{customerId}/loans",method = RequestMethod.GET)
    public List<Loan> getAllLoansofCustomer(@PathVariable  int customerId) {
	    Customer customer=new Customer();
	    customer.setCustomerId(customerId);
	    List<Loan> listLoan=loanService.getLoans(customer);
	    return listLoan;
    }
	
	@CrossOrigin
	@RequestMapping(value="/loanservices/{loanId}/loan",method = RequestMethod.GET)
    public Loan getLoanById(@PathVariable  int loanId) {
	    Loan loan=loanService.getLoanById(loanId);
	    return loan;
    }
}
//Test commit from Git extensions
