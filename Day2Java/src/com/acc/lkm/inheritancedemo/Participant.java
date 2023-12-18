package com.acc.lkm.inheritancedemo;

public class Participant extends Trainer {
	public Participant() {
		super("Apparel");
		System.out.println("Inheritance");
	}
public void myLearning() {
	System.out.println("In Java Training");
}
	protected void display() {
		System.out.println("Testing Protected access");
	}

}
