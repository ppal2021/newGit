package com.acc.lkm.accessprotected;
import com.acc.lkm.inheritancedemo.*;
public class MyTest extends Participant {
	public static void main(String[] args) {
		MyTest myTest=new MyTest();
		Participant participant=new MyTest();
		//Participant participant2=new Participant();
		participant.myLearning();
		//participant.display();
		myTest.display();
		myTest.myLearning();
		//participant.train("Java",6);
		participant.loc("KDC-1D");

	}
}
