package org.opentutorials.javatutorials.eclipse;

public class ArrayLoopDemo {
	public static void main(String[] args){
		String[] members= {"a","b","c"};
		
		/*
		for(int i=0;i<members.length;i++) {
			String member = members[i];
			System.out.println(member+"�� ����� �޾ҽ��ϴ�.");
		}
		*/
		
		for(String e : members) {
			System.out.println(e+"�� ����� �޾ҽ��ϴ�.");
		}
	}
}
