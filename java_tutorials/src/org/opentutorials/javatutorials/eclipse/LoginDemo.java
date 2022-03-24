package org.opentutorials.javatutorials.eclipse;

import java.util.Scanner;

public class LoginDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		String password = sc.next();
		
		/*
		if(id.equals("egoing")) {
			if(password.equals("111111")) {
				System.out.println("right");
			} else {
				System.out.println("password wrong");
			}
		} else {
			System.out.println("id wrong");
		}
		*/
		
		/*
		if(id.equals("egoing")&&password.equals("111111")) {
			System.out.println("right");
		} else {
			System.out.println("wrong");
		}
		*/
		
		if((id.equals("egoing")||id.equals("k8805")||id.equals("sorialgi"))&&password.equals("111111")) {
			System.out.println("right");
		} else {
			System.out.println("wrong");
		}
	}
}
