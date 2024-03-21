package com.Jyothi.cls2;

public class Engineer extends Employee {
	@Override
	public float CalculateBonus()
	{
		return (5f/100f)*getSalary();
	}
	public String toString()
	{
		return "Engineer[name="+this.getName()+" "+"Bonus="+this.CalculateBonus()+"]";
	}
}
