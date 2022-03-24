package org.opentutorials.javatutorials.eclipse;

import java.io.*;

public class MethodDemo {
	
	public static String numbering(int init, int limit) {
		int i= init;
		String ouput="";
		while(i<limit) {
			ouput+=i;
			i++;
		}
		
		return ouput;
	}
	
	public static String[] getMembers() {
		String[] members= {"a","b","c"};
		return members;
	}
	
	public static void main(String[] args) {
		String result = numbering(1,5);
		System.out.println(result);
		
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
			out.write(result);
			out.close();
		} catch (IOException e) {
			
		}
		
		String[] members = getMembers();
		for(String e : members) {
			System.out.println(e);
		}
	}
}
