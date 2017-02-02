package com.capg.loanservice.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component


@Entity
@Table(name="branch")
public class Branch implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="branch_id")
	private int branchid;
	
	@Column(name="branch_name")
	private String branchname;
	
	@Column(name="ifsc_code")
	private String ifsccode;
	
	@Column(name="branch_city")
	private String branchcity;
	
	@Column(name="assets")
    private double assets;
	
	public int getBranchid() {
		return branchid;
	}
	public void setBranchid(int branchid) {
		this.branchid = branchid;
	}
	public String getBranchname() {
		return branchname;
	}
	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}
	public String getBranchcity() {
		return branchcity;
	}
	public void setBranchcity(String branchcity) {
		this.branchcity = branchcity;
	}
	public double getAssets() {
		return assets;
	}
	public void setAssets(double assets) {
		this.assets = assets;
	}
	public String getIfsccode() {
		return ifsccode;
	}
	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}
}
