package com.search.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
import org.springframework.stereotype.Repository;

import com.search.model.Employer;


@Repository
public interface EmployerRepository extends ElasticsearchCrudRepository<Employer, String> {
	
	List<Employer> findByName(String name);

}
