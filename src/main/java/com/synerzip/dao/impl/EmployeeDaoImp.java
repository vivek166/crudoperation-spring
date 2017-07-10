package com.synerzip.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.synerzip.dao.EmployeeDao;
import com.synerzip.model.Employee;

@Repository
public class EmployeeDaoImp implements EmployeeDao {

	@Autowired
	private SessionFactory session;
	@Override
	public void add(Employee employee) {

		session.getCurrentSession().save(employee);
	}

	@Override
	public Employee get(int id) {
		return (Employee)session.getCurrentSession().get(Employee.class, id);
	}

}
