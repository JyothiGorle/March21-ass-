package com.Jyothi.cls2;
/*Employee Inheritance Override: Create a superclass Employee with attributes name and salary, and a method calculateBonus() 
 * that returns 0. Then, create a subclass Manager that extends Employee and overrides the calculateBonus() method to 
 * return 10% of the salary. Similarly, create another subclass Engineer that overrides the calculateBonus() method to 
 * return 5% of the salary. Test this hierarchy by creating instances of Manager and Engineer, setting their salaries, and 
 * calling the calculateBonus() method to ensure the correct bonus calculation.
 */
/*
 * author:Jyothi
 */
public class Employee {
	private String name;
	private float salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public float CalculateBonus()
	{
		return 0;
	}
}
