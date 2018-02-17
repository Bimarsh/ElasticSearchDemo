package com.search.service;

import java.util.List;

import com.search.model.Employer;

public interface EmployerService {
	List<Employer> findByName(String name);
}
