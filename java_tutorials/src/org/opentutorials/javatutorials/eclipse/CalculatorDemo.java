package org.opentutorials.javatutorials.eclipse;


class Calculator{
	static double PI = 3.14;
	static int base = 0;
	int left, right;
	int third = 0;
	
	int[] oprands;
	
	//super 쓰면 기본 생성자 필요x
	public Calculator() {
		//기본 생성자 추가
	}
	
	public Calculator(int left, int right) {
		this.left=left;
		this.right=right;
	}
	
	public void setOprands(int left,int right) {
		System.out.println("setOprands (int left, int right)");
		this.left=left;
		this.right=right;
	}
	
	public void setOprands(int left, int right, int third) {
		System.out.println("setOprands (int left, int right, int third)");
		this.left=left;
		this.right=right;
		this.third=third;
	}
	
	public void setOprands(int[] oprands) {
		this.oprands=oprands;
	}
	
	public void sum() {
		//System.out.println(this.left+this.right+base+this.third);
		
		int total = 0;
		for(int value : this.oprands) {
			total+=value;
		}
		System.out.println(total);
	}
	
	public int avg() {
		//return (this.left+this.right+base+this.third)/2;
		
		int total = 0;
		for(int value : this.oprands) {
			total+=value;
		}
		return total/this.oprands.length;
	}
}

class Calculator2{
	public static void sum(int left, int right) {
		System.out.println(left+right);
	}
	
	public static void avg(int left, int right) {
		System.out.println((left+right)/2);
	}
}

class SubstractionableCalculator extends Calculator{
	public SubstractionableCalculator(int left, int right) {
		/*
		this.left=left;
		this.right=right;
		*/
		super(left, right);
	}
	
	public int avg() {
		return (this.left+this.right+base+this.third)/2;
	}
	
	public void sum() {
		System.out.println("실행 결과는 "+(this.left+this.right)+"입니다.");
	}
	
	public void subsstract() {
		System.out.println(this.left-this.right);
	}
}

class MultiplicationableCalculator extends Calculator{
	public void multiplication() {
		System.out.println(this.left*this.right);
	}
	
	public void sum() {
		System.out.println(this.left+this.right+base+this.third);
	}
	
	public int avg() {
		return (this.left+this.right+base+this.third)/2;
	}
}

class DivisionableCalculator extends MultiplicationableCalculator{
	public void division() {
		System.out.println((double)this.left/this.right);
	}
	
	public void sum() {
		System.out.println(this.left+this.right+base+this.third);
	}
	
	public int avg() {
		return (this.left+this.right+base+this.third)/2;
	}
}


public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		/*
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		System.out.println(c1.PI);
		
		c1.setOprands(10, 20, 30);
		c1.sum();
		System.out.println(c1.avg());
		*/
		
		c1.setOprands(new int[]{10,20});
		c1.sum();
		System.out.println(c1.avg());
		
		c1.setOprands(new int[] {10,20,30});
		c1.sum();
		System.out.println(c1.avg());
		
		/*
		Calculator c2 = new Calculator();
		c2.setOprands(20, 40);
		c2.sum();
		c2.avg();
		System.out.println(c2.PI);
		
		System.out.println(Calculator.PI);
		*/
		
		/*
		Calculator.base = 10;
		c1.sum();
		c2.sum();
		*/
		
		Calculator2.sum(10, 20);
		Calculator2.avg(10, 20);
		
		System.out.println("c3");
		SubstractionableCalculator c3 = new SubstractionableCalculator(10, 20);
		//c3.setOprands(10, 20);
		c3.sum();
		c3.avg();
		c3.subsstract();
		
		MultiplicationableCalculator c4 = new MultiplicationableCalculator();
		c4.setOprands(10, 20);
		c4.sum();
		c4.avg();
		c4.multiplication();
		
		DivisionableCalculator c5 = new DivisionableCalculator();
		c5.setOprands(10, 20);
		c5.sum();
		c5.avg();
		c5.multiplication();
		c5.division();
	}

}
