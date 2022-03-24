package org.opentutorials.javatutorials.eclipse;

public class Helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		
		//escape(이스케이프) - \사용
		System.out.println("egoing said \"Weclome programing world\"");
		
		//double b = 1.1;
		
		String first="coding";
		System.out.println(first+" " + "everybody");
		
		/* 여러 줄 주석
		//변수 사용 -> 코드의 재활용성 증가
		int a = 1000;
		
		System.out.println(a+10);
		System.out.println((a+10)/10);
		System.out.println(((a+10)/10)-10);
		System.out.println((((a+10)/10)-10)*10);
		*/
		
		//;세미콜론 이용 -> 여러개의 문장 한 줄에 표현
		int a = 100; double b = 10.1;
		
		//뒤에 F 사용 -> float 데이터 타입이라는 것을 명시적으로 표현
		//F안하면 실수 = double
		float c = 2.2F;
		
		//2147483648 = int의 최댓값보다 1 많음 -> 뒤에 L -> 상수 Long으로 명시적 변환
		long d = 2147483648L;
		
		byte e = 100;
		short f =200;
		
		//자동 형변환 2번 - g+h, i
		int g =  3;
		float h = 1.0F;
		double i = g + h;
		System.out.println(i);
		
		//명시적 형변환
		float j = (float)100.0;
		int k = (int)100.0F;
	}
}

/**
 * JavaDoc 주석
 */
