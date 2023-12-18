package com.acc.lkm.abstractiondemo;

public class Accenture implements Emp,Project{

	public static void main(String[] args) {
		Accenture accenture=new Accenture();
		Emp emp=new Accenture();
		accenture.details("Prakash");
		System.out.println(accenture.budget(125000.00));
		System.out.println(Emp.salary(80000.00));
		System.out.println(emp.id(300));

	}

	

	@Override
	public void details(String emp_name) {
		System.out.println(emp_name);
		
	}



	@Override
	public double budget(double budg) {
		
		return budg;
	}

}
