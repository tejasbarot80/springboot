package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDao implements EmployeeService {
    
	@Autowired
	EmployeeRepo er;
	public void register(Employee ee)
	{
		er.save(ee);

	}

}
