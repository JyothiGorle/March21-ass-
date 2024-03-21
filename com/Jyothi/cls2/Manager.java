package com.Jyothi.cls2;

public class Manager extends Employee{
	@Override
	public float CalculateBonus()
	{
		return (10f/100f)*getSalary();
	}
	public String toString()
	{
		return "Manager[name="+this.getName()+" "+"Bonus="+this.CalculateBonus()+"]";
	}
}
