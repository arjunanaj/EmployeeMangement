package com.EmployeeManagement.Repository;

import com.EmployeeManagement.Model.EmployeeDTO;


public interface EmployeeRepository {
	public String addNewEmployee(EmployeeDTO employee) throws Exception;
	public EmployeeDTO getEmployeeById(String empId) throws Exception;
	public String deleteEmployee(String empId) throws Exception;
	public String updateEmployee(EmployeeDTO employee) throws Exception;
	
}
