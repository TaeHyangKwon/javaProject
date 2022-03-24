package org.opentutorials.javatutorials.eclipse;

import java.util.Scanner;
import java.io.*;

public class InputDemo {
	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			System.out.println(sc.nextInt()*1000);
		}
		sc.close();
		*/
		
		try {
			File file = new File("out.txt");
			Scanner sc = new Scanner(file);
			while(sc.hasNextInt()) {
				System.out.println(sc.nextInt()*1000);
			}
			sc.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
