package com.acc.lkm.abstractiondemo;

public class Market extends Employee{
    
	public Market(String market) {
		super(8L);
		System.out.println(market);
		System.out.println(super.empID);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Market market=new Market("North AMerica");
		market.Profskill();
		Employee employee=new Department("Java");
		//employee.org("Accenture");
		employee.Profskill();

	}

	@Override
	void Profskill() {
		super.org("Accenture");
		
	}

}
