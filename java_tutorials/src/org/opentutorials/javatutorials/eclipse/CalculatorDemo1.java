package org.opentutorials.javatutorials.eclipse;

class Calculator1 {
	int left, right;
	
	public Calculator1(int left, int right) {
		this.left=left;
		this.right=right;
	}
	
	public void sum() {
		System.out.println(this.left+this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}

public class CalculatorDemo1 {
	
	public static void main(String[] args) {
		Calculator1 c1 = new Calculator1(10, 20);
		c1.sum();
		c1.avg();
		
		Calculator1 c2 = new Calculator1(20, 40);
		c2.sum();
		c2.avg();
	}

}
