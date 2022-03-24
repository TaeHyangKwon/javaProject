package org.opentutorials.javatutorials.eclipse;

import java.util.*;

public class ListDemo {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("one");
		al.add("two");
		al.add("two");
		al.add("three");
		al.add("three");
		al.add("five");
		System.out.println("array");
		
		for(int i=0;i<al.size();i++) {
			String val = al.get(i);
			System.out.println(val);
		}
		
		/*
		Iterator ai = al.iterator();
		while(ai.hasNext()) {
			System.out.println(ai.next());
		}
		*/
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("one");
		hs.add("two");
		hs.add("two");
		hs.add("three");
		hs.add("three");
		hs.add("five");
		Iterator hi = hs.iterator();
		System.out.println("\nhashset");
		while(hi.hasNext()) {
			System.out.println(hi.next());
		}
	}
}
