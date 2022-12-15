package com.globallogic.model;

public class Employee {

	public int id;
	public String name;
	public String department;
	public Double salary;
	public int noOfDaysPresent;

	public Employee(int id, String name, String department, double salary, int noOfDaysPresent) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.noOfDaysPresent = noOfDaysPresent;
	}

}
