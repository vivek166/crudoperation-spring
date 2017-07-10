package com.synerzip.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synerzip.dao.EmployeeDao;
import com.synerzip.model.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService{

	@Autowired
	private EmployeeDao employeeDao;
	@Transactional
	public void add(Employee employee) {
		employeeDao.add(employee);
	}

	@Transactional
	public Employee get(int id) {
		return employeeDao.get(id);
	}

}
