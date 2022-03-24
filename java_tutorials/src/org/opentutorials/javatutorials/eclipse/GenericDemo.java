package org.opentutorials.javatutorials.eclipse;

class StudentInfo{
	public int grade;
	StudentInfo(int grade){this.grade = grade;}
}

interface Info{
	int getLevel();
}

class EmployeeInfo implements Info{
	public int rank;
	EmployeeInfo(int rank){this.rank = rank;}
	public int getLevel() {
		return this.rank;
	}
}

class Person<T extends Info>{
	public T info;
	Person(T info){this.info = info;}
}

/*
class Person<T, S>{
	public T info;
	public S id;
	Person(T info, S id) {
		this.info = info;
		this.id = id;
	}
	
	public <U> void printInfo(U info) {
		System.out.println(info);
	}
}
*/

public class GenericDemo {
	public static void main(String[] args) {
		/*
		EmployeeInfo e = new EmployeeInfo(1);
		Integer i = new Integer(10);
		Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(e, i);
		
		//제네릭 생략 가능
		Person p2 = new Person<EmployeeInfo, Integer>(e,i);
		
		System.out.println(p1.id.intValue());
		
		p1.<EmployeeInfo>printInfo(e);
		p1.printInfo(e);
		*/
		
		Person p1 = new Person(new EmployeeInfo(1));
		EmployeeInfo e = (EmployeeInfo)p1.info;
		System.out.println(e.getLevel());
	}
}
