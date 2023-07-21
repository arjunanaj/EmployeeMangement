package com.EmployeeManagement.Service;

import com.EmployeeManagement.Model.EmployeeDTO;

public interface  EmployeeService {
	
	public String addNewEmployee(EmployeeDTO employee) throws Exception;
	public EmployeeDTO getEmployeeById(String empId) throws Exception;
	public String deleteEmployee(String empId) throws Exception;
	public String updateEmployee(EmployeeDTO employee) throws Exception;

}
