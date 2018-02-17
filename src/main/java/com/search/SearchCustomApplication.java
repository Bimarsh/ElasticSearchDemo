package com.search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;

import com.search.model.Employer;
import com.search.repository.EmployerRepository;

@SpringBootApplication
public class SearchCustomApplication implements CommandLineRunner {
//	@Bean
//    public ElasticsearchOperations elasticsearchTemplate() {
//        return new ElasticsearchTemplate(nodeBuilder().local(true).node().client());
//    }

	@Autowired
	private EmployerRepository employerRepository;
	public static void main(String[] args) {
		SpringApplication.run(SearchCustomApplication.class, args);
	}

	public void employeeStuffs()
	{
		Employer emp = new Employer("xx");
		System.out.println("Saved......."+employerRepository.save(emp));
	}
	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		employeeStuffs();
	}
	
	
}
