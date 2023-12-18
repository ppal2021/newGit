package com.acc.lkm.abstractiondemo;

public interface Emp {
	void details(String emp_name);
	static double salary(double salary) {
		return salary;
	}
	default int id(int empid) {
		return empid;
	}

}
