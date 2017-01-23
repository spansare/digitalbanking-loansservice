package com.capg.loanservice.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.capg.loanservice.model.Branch;

@Repository
@Transactional
public interface BranchDao extends CrudRepository<Branch, Long> {

}
