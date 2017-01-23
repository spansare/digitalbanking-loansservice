package com.capg.loanservice.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "loan")
public class Loan implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="loan_account_id")
	private int loanAccountId;
	
	@Column(name="branch_id")
	private int branchid;
	
	@Column(name="loan_account_number")
	private String loanAccountNumber;
	
	@Column(name="amount")
	private double amount;
	
	@Column(name="loan_type")
	private String loanType;
	
	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customer customer;

	@Column(name="duration")
	private double duration;
	
	@Column(name="rate_of_interest")
	private String rateOfInterest;
	
	@Column(name="loan_status")
	private String loanStatus;
	
	@Column(name="loan_commencement_date")
	private Timestamp loanCommencementDate;
	
	@Column(name="loan_creation_date")
	private Timestamp loanCreationDate;
	
	@Column(name="loan_emi_date")
	private Timestamp loanEmiDate;
	
	public int getLoanAccountId() {
		return loanAccountId;
	}
	public void setLoanAccountId(int loanAccountId) {
		this.loanAccountId = loanAccountId;
	}
	public int getBranchid() {
		return branchid;
	}
	public void setBranchid(int branchid) {
		this.branchid = branchid;
	}
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public String getLoanAccountNumber() {
		return loanAccountNumber;
	}
	public void setLoanAccountNumber(String loanAccountNumber) {
		this.loanAccountNumber = loanAccountNumber;
	}
	@JsonIgnore
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public String getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(String rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	public String getLoanStatus() {
		return loanStatus;
	}
	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}
	public Timestamp getLoanCommencementDate() {
		return loanCommencementDate;
	}
	public void setLoanCommencementDate(Timestamp loanCommencementDate) {
		this.loanCommencementDate = loanCommencementDate;
	}
	public Timestamp getLoanCreationDate() {
		return loanCreationDate;
	}
	public void setLoanCreationDate(Timestamp loanCreationDate) {
		this.loanCreationDate = loanCreationDate;
	}
	public Timestamp getLoanEmiDate() {
		return loanEmiDate;
	}
	public void setLoanEmiDate(Timestamp loanEmiDate) {
		this.loanEmiDate = loanEmiDate;
	}
	
}
