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
			System.out.println("out.txt 파일은 설정 파일 입니다. 이 파일이 루트 디렉토리에 존재해야 합니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
