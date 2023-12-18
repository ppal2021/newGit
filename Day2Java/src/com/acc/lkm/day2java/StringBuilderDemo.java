package com.acc.lkm.day2java;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder stringBuilder=new StringBuilder();
		System.out.println(stringBuilder.capacity());
		stringBuilder.append("Learning StringBuilder");
		System.out.println(stringBuilder.capacity());
		stringBuilder.append("Today is Day 2 Learning StringBuilder from KDC Accenture");
		stringBuilder.ensureCapacity(100);
		System.out.println(stringBuilder.capacity());
		stringBuilder.ensureCapacity(200);
		System.out.println(stringBuilder.capacity());
		//stringBuilder.insert(2,"Accenture");
		//stringBuilder.replace(2, 5, "Java");
		//stringBuilder.reverse();
		System.out.println(stringBuilder.capacity());

	}

}
