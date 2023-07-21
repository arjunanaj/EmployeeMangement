package com.EmployeeManagement.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.EmployeeManagement.Model.EmployeeDTO;


@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{
	
	@Autowired
	 JdbcTemplate jdbcTemplate;

	@Override
	public String addNewEmployee(EmployeeDTO employee) throws Exception {
		
		String query="insert into employee (employee_id,employee_name,email_id,date_of_joining,salary) values(?,?,?,?,?)";
		jdbcTemplate.update(query,employee.getEmployeeId(),employee.getEmployeeName(),employee.getEmailId(),employee.getDateOfJoining(),employee.getSalary());
		return employee.getEmployeeId();
		
		
	}

	@Override
	public EmployeeDTO getEmployeeById(String empId) throws Exception {
		String query="select * from  employee where employee_id=?";
		return jdbcTemplate.queryForObject(query, new Object[] {empId},new EmployeeRowMapper());
		
	}

	@Override
	public String deleteEmployee(String empId) throws Exception {
		String query ="delete from employee u where employee_id=? ";
		jdbcTemplate.update(query,empId);
		return empId;
		
		
	}

	@Override
	public String  updateEmployee(EmployeeDTO employee) throws Exception {
		
		 String query="update employee Set employee_name=?,email_id=?,salary=? where employee_id=?" ;	
	     jdbcTemplate.update(query,employee.getEmployeeName(),employee.getEmailId(),employee.getSalary(),employee.getEmployeeId());
		return employee.getEmployeeId();
		
		
	}

}
