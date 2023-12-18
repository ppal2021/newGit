package com.acc.lkm.abstractiondemo;

public abstract class Employee  {
	int empID=100;
	public Employee(long timeline) {
		System.out.println(timeline);
	}
	abstract void Profskill();
	void org(String company) {
		System.out.println(company);
	}

}
