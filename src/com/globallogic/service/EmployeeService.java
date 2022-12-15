package com.globallogic.service;

import com.globallogic.model.Employee;

public class EmployeeService {

	/*
	 * @Description : Finds salary per day of the employee
	 * 
	 * @Param : It takes salary and number of days present of the employee
	 * 
	 * @returns : It returns per day salary of the employee
	 * 
	 */

	public double findPerDaySalary(Employee employee) {

		return (employee.salary / 22);
	}

	/*
	 * @Description : Finds total salary of the employee
	 * 
	 * @Param : It takes per day salary and number of days present of the employee
	 * 
	 * @returns : It returns total salary of the employee
	 * 
	 */
	public double totalSalaryOfTheMonth(double perDaySalary, int noOfDaysPresent) {
		return noOfDaysPresent * perDaySalary;
	}

	/*
	 * @Description : Increments total salary of the employee
	 * 
	 * @Param : It takes salary and incremental percent of the employee
	 * 
	 * @returns : It returns total salary of the employee after the increment
	 * 
	 */
	public double incrementSalary(double salary, double percent) {
		return (salary + (salary * (percent / 100)));
	}

}
