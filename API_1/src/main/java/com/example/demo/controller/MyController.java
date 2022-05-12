package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@RestController
public class MyController {

	@Autowired
	private EmployeeRepository employeeRepository;

	@PostMapping("/addEmployee")
	public String addEmployee(@RequestBody Employee employee) {
		employeeRepository.save(employee);
		return "Employee Save successfully..";
	}

}
