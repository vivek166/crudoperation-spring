package com.synerzip.dao;

import com.synerzip.model.Employee;

public interface EmployeeDao {

	public void add(Employee employee);
	public Employee get(int id);
}
