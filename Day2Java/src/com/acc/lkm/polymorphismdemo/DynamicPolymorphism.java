package com.acc.lkm.polymorphismdemo;

public class DynamicPolymorphism {

	public static void main(String[] args) {
		Market europe,functions,market;
		market=new Market();
		europe=new Europe();
		functions=new Functions();
		System.out.println(market.marketrevenue(11.23));
		System.out.println(functions.marketrevenue(17.311));
		System.out.println(europe.marketrevenue(18.665));

	}

}
