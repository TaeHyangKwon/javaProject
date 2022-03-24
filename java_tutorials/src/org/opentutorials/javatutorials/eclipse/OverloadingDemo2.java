package org.opentutorials.javatutorials.eclipse;

public class OverloadingDemo2 extends OverloadingDemo {
	void A (String arg1, String arg2) {System.out.println("sub calss : void A (String arg1, String arg2)");}	//메소드 오버로딩
	void A () {System.out.println("sub class void A()");}	//메소드 오버라이딩
	
	public static void main(String[] args) {
		OverloadingDemo2 od = new OverloadingDemo2();
		od.A();
		od.A(1);
		od.A("coding everybody");
		od.A("coing ecerybody", "coding everybody");
	}
}
