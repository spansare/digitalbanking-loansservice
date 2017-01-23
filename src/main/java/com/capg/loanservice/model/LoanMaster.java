package com.capg.loanservice.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/*@Configuration
@Component*/
@Entity
@Table(name="loanmaster")
public class LoanMaster implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="loan_id")
	private int loanId;
	
	@Column(name="loan_name")
	private int loanname;

	@Column(name="loan_type")
	private int loantype;

	public int getLoanId() {
		return loanId;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	public int getLoanname() {
		return loanname;
	}

	public void setLoanname(int loanname) {
		this.loanname = loanname;
	}

	public int getLoantype() {
		return loantype;
	}

	public void setLoantype(int loantype) {
		this.loantype = loantype;
	}
	
}
