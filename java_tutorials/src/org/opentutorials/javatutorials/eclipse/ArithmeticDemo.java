package org.opentutorials.javatutorials.eclipse;

public class ArithmeticDemo {
	public static void main(String[] args) {
		int result = 1+2;
		System.out.println(result);
		
		result = result-1;
		System.out.println(result);
		
		result = result*2;
		System.out.println(result);
		
		result = result/2;
		System.out.println(result);
		
		result = result+8;
		System.out.println(result);
		
		result = result%7;
		System.out.println(result);
		
		int a=3;
		System.out.println(0%a);
		System.out.println(1%a);
		System.out.println(2%a);
		System.out.println(3%a);
		System.out.println(4%a);
		System.out.println(5%a);
		System.out.println(6%a);
		
		//+������ ���ڿ� ����
		String firstString = "This is";
		String secondString = " a concatenated string.";
		String thirdString = firstString+secondString;
		System.out.println(thirdString);
		
		int b = 10;
		int c = 3;
		
		float d = 10.0F;
		float e = 3.0F;
		
		System.out.println(b/c);	//����/���� -> ��  �������� ������
		System.out.println(d/e);	
		System.out.println(b/e);	//����/�Ǽ� -> �Ͻ��� �� ��ȯ  -> ����b->�Ǽ�
		
		
		//���׿�����
		int i=3;
		i++;
		System.out.println(i);
		++i;
		System.out.println(i);
		System.out.println(++i);
		System.out.println(i++);
		System.out.println(i);
	}

}
