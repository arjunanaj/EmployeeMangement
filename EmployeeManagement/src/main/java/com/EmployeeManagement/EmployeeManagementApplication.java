package com.EmployeeManagement;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import com.EmployeeManagement.Controller.EmployeeController;
import com.EmployeeManagement.Model.EmployeeDTO;

@SpringBootApplication
public class EmployeeManagementApplication implements CommandLineRunner {
	@Autowired
	private EmployeeController employeeController;
	
	@Autowired
	private Environment environment;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// addEmployee();
	   // getEmployee();
	    // deleteEmployee();
	     updateEmployee();

	}

	public void addEmployee() throws Exception {

		try {

			EmployeeDTO employeeDTO = new EmployeeDTO();
			employeeDTO.setEmployeeId("Emp105");
			employeeDTO.setEmployeeName("Mani");
			employeeDTO.setEmailId("mani@gmail.com");
			employeeDTO.setDateOfJoining(new Date(System.currentTimeMillis()));
			employeeDTO.setSalary(150000.00);
			String employee = employeeController.addNewEmployee(employeeDTO);
			String message = environment.getProperty("UserInterfaceAddSucessfully")+ employee;
			System.out.println(message);

		} catch (Exception e) {
			throw e;
		}
	}

	public void getEmployee() throws Exception {

		try {
			EmployeeDTO employeeDTO = employeeController.getEmployeeById("emp101");

			System.out.println("EmployeeId :" + employeeDTO.getEmployeeId());
			System.out.println("Employee Name :" + employeeDTO.getEmployeeName());
			System.out.println("EmailId :" + employeeDTO.getEmailId());
			System.out.println("DateOfJoining:" + employeeDTO.getDateOfJoining());
			System.out.println("Salary:" + employeeDTO.getSalary());

		} catch (Exception e) {
			 throw e;
		}
	}
	

	public void deleteEmployee() throws Exception {

		try {
			String employee = employeeController.deleteEmployee("Emp107");
			String message = environment.getProperty("UserInterfaceDeleteSucessfully")+ employee;
			System.out.println(message);

		} catch (Exception e) {
			throw e;
		}
	}
	

	public void updateEmployee() throws Exception {

		try {

			EmployeeDTO employeeDTO = new EmployeeDTO();
			employeeDTO.setEmployeeId("Emp101");
			employeeDTO.setEmployeeName("arunKumar");
			employeeDTO.setEmailId("arun123@gamil.com");
			employeeDTO.setDateOfJoining(new Date(System.currentTimeMillis()));
			employeeDTO.setSalary(130000.00);
			String employee = employeeController.updateEmployee(employeeDTO);
			String message = environment.getProperty("UserInterfaceUpdateSucessfully")+ employee;
			System.out.println(message);

		} catch (Exception e) {
			throw e;
		}
	}

}
