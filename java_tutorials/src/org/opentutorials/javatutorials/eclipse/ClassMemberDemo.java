package org.opentutorials.javatutorials.eclipse;


class C1{
	static int static_variable = 1;
	int instance_variable = 2;
	
	static void static_static() {
		System.out.println(static_variable);
	}
	
	static void static_instance() {
		//Ŭ���� �޼ҵ忡���� �ν��Ͻ� ������ ���� x
		//System.out.pritnln(instance_variable);
	}
	void instance_static() {
		//�ν��Ͻ� �޼ҵ忡���� Ŭ���� ������ ���� o
		System.out.println(static_variable);
	}
	void instance_instance() {
		System.out.println(instance_variable);
	}
}

class C3{
	int v = 10;
	
	void m() {
		int v = 20;
		System.out.println(this.v);
	}
}

public class ClassMemberDemo {
	public static void main(String[] args) {
		C1 c = new C1();
		
		c.static_static();
		
		//c.static_instance();
		
		c.instance_static();
		
		c.instance_instance();
		
		C1.static_static();
		
		//C1.static_instance();
		
		C3 c1 = new C3();
		c1.m();
		
	}
}
