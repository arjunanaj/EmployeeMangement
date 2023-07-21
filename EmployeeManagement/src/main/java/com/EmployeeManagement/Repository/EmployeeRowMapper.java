package com.EmployeeManagement.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.EmployeeManagement.Model.EmployeeDTO;



public class EmployeeRowMapper  implements RowMapper<EmployeeDTO> {

	@Override
	public EmployeeDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		EmployeeDTO employeeDTO=new EmployeeDTO();
		employeeDTO.setEmployeeId(rs.getString("employee_id"));
		employeeDTO.setEmployeeName(rs.getString("employee_name"));;
		employeeDTO.setEmailId(rs.getString("email_id"));
		employeeDTO.setDateOfJoining(rs.getDate("date_of_joining"));;
		employeeDTO.setSalary(rs.getDouble("salary"));;
		return employeeDTO;
	}

}
