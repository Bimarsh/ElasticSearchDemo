package com.search.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.search.model.Employer;
import com.search.repository.EmployerRepository;


@Service
public class EmployerServiceImpl implements EmployerService {

	
	@Autowired
	private EmployerRepository employerRepository;
	
	@Override
	public List<Employer> findByName(String name) {
		
		return employerRepository.findByName(name);
	}

}
