package org.opentutorials.javatutorials.eclipse;

class Student implements Cloneable{
	
	String name;
	
	Student(String name){
		this.name=name;
	}
	
	public boolean equals(Object obj) {
		Student _obj = (Student)obj;
		return name==_obj.name;
	}
	
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

public class ObjectDemo {
	public static void main(String[] args) {
		Student s1 = new Student("egoing");
		Student s2 = new Student("egoing");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		try {
			Student s3 = (Student)s1.clone();
			System.out.println(s1.name);
			System.out.println(s3.name);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
