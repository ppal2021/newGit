package com.acc.lkm.abstractiondemo;

public class Department extends Employee{

	public Department(String dept_name) {
		super(6L);
		System.out.println(dept_name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void Profskill() {
		System.out.println("P4");
		
	}
 
}
