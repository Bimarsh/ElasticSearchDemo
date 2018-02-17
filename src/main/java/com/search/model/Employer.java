package com.search.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;


@Document(indexName = "emp_index", type="employer")
public class Employer {

	Employer()
	{
		
	}
	public Employer(String name)
	{
		this.name=name;
	}
	@Id
	private String id;
	
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employer [id=" + id + ", name=" + name + "]";
	}
}
