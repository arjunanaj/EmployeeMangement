package com.EmployeeManagement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EmployeeManagement.Model.EmployeeDTO;
import com.EmployeeManagement.Repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public String addNewEmployee(EmployeeDTO employee) throws Exception {

		return employeeRepository.addNewEmployee(employee);
	}

	@Override
	public EmployeeDTO getEmployeeById(String empId) throws Exception {

		return employeeRepository.getEmployeeById(empId);
	}

	@Override
	public String deleteEmployee(String empId) throws Exception {

		return employeeRepository.deleteEmployee(empId);

	}

	@Override
	public String updateEmployee(EmployeeDTO employee) throws Exception {

		return employeeRepository.updateEmployee(employee);
	}

}
