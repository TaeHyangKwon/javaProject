package org.opentutorials.javatutorials.eclipse;

abstract class A{
	public abstract int b();	//�߻� �޼ҵ�
	
	public void d() {
		System.out.println("world");
	}
}

class B extends A{
	public int b() {return 1;}	//�߻� �޼ҵ� b �������̵�
}

public class AbstractDemo {
	public static void main(String[] args) {
		B obj = new B();
		System.out.println(obj.b());
	}

}
