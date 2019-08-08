package com.elk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.elk.dao.EmployeeRepository;
import com.elk.model.Employee;

@RestController
@RequestMapping("employee")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;

	@RequestMapping(value = "save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee saveEmp(Employee employee) {
		Employee save = employeeRepository.save(employee);
		return save;
	}
	
	@RequestMapping(value = "get", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmp(String id) {
		Employee save = employeeRepository.findById(id).get();
		return save;
	}
	
	@RequestMapping(value = "getByDesAndName", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getByDesAndName(String designation, String name) {
		return employeeRepository.findByDesignationAndName(designation, name);
	}

	public static void main(String[] args) {
	}

}
