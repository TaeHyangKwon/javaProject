package org.opentutorials.javatutorials.eclipse;

abstract class A{
	public abstract int b();	//추상 메소드
	
	public void d() {
		System.out.println("world");
	}
}

class B extends A{
	public int b() {return 1;}	//추상 메소드 b 오버라이딩
}

public class AbstractDemo {
	public static void main(String[] args) {
		B obj = new B();
		System.out.println(obj.b());
	}

}
