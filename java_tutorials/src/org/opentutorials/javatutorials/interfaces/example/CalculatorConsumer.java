package org.opentutorials.javatutorials.interfaces.example;

interface Caculatable{
	public void setOprands(int first, int second, int third);
	public int sum();
	public int avg();
}

class CalculatorDummy implements Caculatable{

	@Override
	public void setOprands(int first, int second, int third) {
		
	}

	@Override
	public int sum() {		
		return 60;
	}

	@Override
	public int avg() {
		return 20;
	}
	
}

class Calculator implements Caculatable{
	int first, second, third;

	@Override
	public void setOprands(int first, int second, int third) {
		this.first=first;
		this.second=second;
		this.third=third;
	}

	@Override
	public int sum() {		
		return this.first+this.second+this.third;
	}

	@Override
	public int avg() {
		return (this.first+this.second+this.third)/3;
	}
	
}

public class CalculatorConsumer {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.setOprands(10, 20, 30);
		System.out.println(c.sum()+c.avg());
	}
}
