package com.Jyothi.p2;
import com.Jyothi.cls2.Engineer;
import com.Jyothi.cls2.Manager;
/*Employee Inheritance Override: Create a superclass Employee with attributes name and salary, and a method calculateBonus() 
 * that returns 0. Then, create a subclass Manager that extends Employee and overrides the calculateBonus() method to 
 * return 10% of the salary. Similarly, create another subclass Engineer that overrides the calculateBonus() method to 
 * return 5% of the salary. Test this hierarchy by creating instances of Manager and Engineer, setting their salaries, and 
 * calling the calculateBonus() method to ensure the correct bonus calculation.
 */
/*
 * author:Jyothi
 */
public class Jyothi_prog2 {
	public static void main(String[] args) {
		Manager m=new Manager();
		m.setSalary(11);
		m.setName("Jyothi");
		System.out.println(m.toString());	
		Engineer e=new Engineer();
		e.setSalary(15);
		e.setName("Bindu");
		System.out.println(e.toString());
		
	}
}
