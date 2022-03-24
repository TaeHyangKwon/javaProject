package org.opentutorials.javatutorials.accessmodifier;


class Calculator{
	private int left, right;
	
	public void setOprands(int left, int right) {
		this.left=left;
		this.right=right;
	}
	private int _sum() {
		return this.left+this.right;
	}
	public void sumDecoPlus() {
		System.out.println("++++"+_sum()+"++++");
	}
	public void sumDecoMinus() {
		System.out.println("----"+_sum()+"----");
	}
}

public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.setOprands(10, 20);
		c.sumDecoPlus();
		c.sumDecoMinus();
	}

}
