package com.acc.lkm.polymorphismdemo;

public class Accenture extends DynamicUpcasting {
/*void project(long project_month) {
	System.out.println(project_month);
}*/
void project(String proj){
	System.out.println(proj);
}
{
	System.out.println(EID);
}
	public static void main(String[] args) {
		DynamicUpcasting dynamicUpcasting=new Accenture();//Upcasting
		dynamicUpcasting.project(2344556L);
		dynamicUpcasting.project(10000L);
		//Downcasting
		Accenture accenture=(Accenture) dynamicUpcasting;//Downcasting possible through explicitely
        accenture.project(7765L);
        accenture.EID=1123345L;
        accenture.project("Hybris");
	}

}
