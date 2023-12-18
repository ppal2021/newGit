package com.acc.lkm.inheritancedemo;

public class Trainer extends Organisation{
	
public Trainer(String trainer) {
		super("Hybris");
		System.out.println(trainer);
	}
  protected void display() {
	  System.out.println("Protected Access");
  }
void train(String Tech,int CohortNo) {
	System.out.println(Tech+" "+CohortNo);
}
}
