package com.elk.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
import org.springframework.stereotype.Repository;

import com.elk.model.Employee;

@Repository
public interface EmployeeRepository extends ElasticsearchCrudRepository<Employee, String>{

	public Optional<Employee> findById(String id);
	public List<Employee> findByDesignation(String designation);
	
	public List<Employee> findByDesignationAndName(String designation, String name);
	
}
