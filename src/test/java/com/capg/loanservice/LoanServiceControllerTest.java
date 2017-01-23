package com.capg.loanservice;


import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.capg.loanservice.model.Customer;
import com.capg.loanservice.model.Loan;
import com.capg.loanservice.service.LoanService;
import com.capg.loanservice.web.LoanServicesController;
 
@RunWith(SpringRunner.class)
@WebMvcTest(LoanServicesController.class)
public class LoanServiceControllerTest {
	
	@Autowired
	private MockMvc mvc;

	@MockBean	
	private LoanService loanService;
	
	@Test
	public void getAllLoansofCustomer() throws Exception {
		List<Loan> loanList = new ArrayList<Loan>();
		Loan l1 = new Loan();
		l1.setLoanAccountNumber("HL-123");
		loanList.add(l1);
		Customer customer=new Customer();
		customer.setCustomerId(123);
		
		//Mocking the service call 
		when(loanService.getLoans(customer)).thenReturn(loanList);
		
		//Mocking the get call in controller
		mvc.perform(MockMvcRequestBuilders.get("/loanservice/{customerId}/loans", 1))
		.andExpect(MockMvcResultMatchers.status().isOk());
	}
	
	@Test
	public void getLoanById() throws Exception {
		Loan loan = new Loan();
		loan.setLoanAccountNumber("PL-123");
		
		//Mocking the service call 
		when(loanService.getLoanById(anyInt())).thenReturn(loan);
		
		//Mocking the get call in controller
		mvc.perform(MockMvcRequestBuilders.get("/loanservice/{loanAccountId}/loan", 12))
		.andExpect(MockMvcResultMatchers.status().isOk());
	}
}
