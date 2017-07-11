package com.synerzip.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.synerzip.model.Employee;
import com.synerzip.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	public String setupForm(Map<String , Object> map){
		Employee employee = new Employee();
		map.put("employee", employee);
		return "employee";
	}
	
	@RequestMapping(value="/student.do", method=RequestMethod.POST)
	public String doActions(@ModelAttribute Employee employee, BindingResult result, @RequestParam String action, Map<String , Object> map){
		Employee employeeResult = new Employee();
		switch(action.toLowerCase()){
			case "add":
				employeeService.add(employee);
				employeeResult =employee;
				break;
			case "search":
				Employee searchEmployee = new Employee();
				employeeResult = searchEmployee!=null ? searchEmployee : new Employee();
				break;
		}
		map.put("employee", employeeResult);
		return "employee";
	}
}
