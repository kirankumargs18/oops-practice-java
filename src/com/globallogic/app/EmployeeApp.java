package com.globallogic.app;

import com.globallogic.model.Employee;
import com.globallogic.service.EmployeeService;

public class EmployeeApp {

	public static void main(String[] args) {

		Employee employee = new Employee(43, "Kiran", "Development", 80000, 20);

		EmployeeService employeeService = new EmployeeService();

		double perDaySalary = employeeService.findPerDaySalary(employee);

		double totalSalary = employeeService.totalSalaryOfTheMonth(perDaySalary, employee.noOfDaysPresent);

		System.out.println("Total No of Days present in the month : " + employee.noOfDaysPresent);

		System.out.println("Total Salary of the employee per month : " + totalSalary);

		double incrementedSalary = employeeService.incrementSalary(employee.salary, 25);
		
		System.out.println("Total Salary of the employee per month after the increment : " + incrementedSalary);

	}

}
