package com.synerzip.service;

import com.synerzip.model.Employee;

public interface EmployeeService {
	public void add(Employee employee);
	public Employee get(int id);
}
