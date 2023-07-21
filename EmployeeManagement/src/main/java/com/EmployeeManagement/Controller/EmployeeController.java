package com.EmployeeManagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.EmployeeManagement.Model.EmployeeDTO;
import com.EmployeeManagement.Service.EmployeeService;

@Controller
public class EmployeeController {
   
	@Autowired
	private EmployeeService employeeService;
	
	public String addNewEmployee(EmployeeDTO employee) throws Exception{
		return employeeService.addNewEmployee(employee);
		
	}
	public EmployeeDTO getEmployeeById(String empId) throws Exception{
		return employeeService.getEmployeeById(empId);
		
	}
	public String deleteEmployee(String empId) throws Exception{
		return employeeService.deleteEmployee(empId);
		
	}
	public String updateEmployee(EmployeeDTO employee) throws Exception{
		return employeeService.updateEmployee(employee);
		
	}

	
}
