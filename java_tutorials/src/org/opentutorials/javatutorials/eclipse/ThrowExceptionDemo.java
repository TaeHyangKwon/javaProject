package org.opentutorials.javatutorials.eclipse;

import java.io.*;

class D{
	void run() throws IOException, FileNotFoundException{
		BufferedReader bReader = null;
		String input = null;
		bReader = new BufferedReader(new FileReader("out.txt"));
		input = bReader.readLine();
		System.out.println(input);
	}
}

class C{
	void run() throws IOException, FileNotFoundException{
		D b = new D();
		b.run();
	}
}

public class ThrowExceptionDemo {
	public static void main(String[] args) {
		C c = new C();
		
		try {
			c.run();
		} catch (FileNotFoundException e) {
			System.out.println("out.txt ������ ���� ���� �Դϴ�. �� ������ ��Ʈ ���丮�� �����ؾ� �մϴ�.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}