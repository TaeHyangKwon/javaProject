package org.opentutorials.javatutorials.eclipse;

public class Helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		
		//escape(�̽�������) - \���
		System.out.println("egoing said \"Weclome programing world\"");
		
		//double b = 1.1;
		
		String first="coding";
		System.out.println(first+" " + "everybody");
		
		/* ���� �� �ּ�
		//���� ��� -> �ڵ��� ��Ȱ�뼺 ����
		int a = 1000;
		
		System.out.println(a+10);
		System.out.println((a+10)/10);
		System.out.println(((a+10)/10)-10);
		System.out.println((((a+10)/10)-10)*10);
		*/
		
		//;�����ݷ� �̿� -> �������� ���� �� �ٿ� ǥ��
		int a = 100; double b = 10.1;
		
		//�ڿ� F ��� -> float ������ Ÿ���̶�� ���� ��������� ǥ��
		//F���ϸ� �Ǽ� = double
		float c = 2.2F;
		
		//2147483648 = int�� �ִ񰪺��� 1 ���� -> �ڿ� L -> ��� Long���� ����� ��ȯ
		long d = 2147483648L;
		
		byte e = 100;
		short f =200;
		
		//�ڵ� ����ȯ 2�� - g+h, i
		int g =  3;
		float h = 1.0F;
		double i = g + h;
		System.out.println(i);
		
		//����� ����ȯ
		float j = (float)100.0;
		int k = (int)100.0F;
	}
}

/**
 * JavaDoc �ּ�
 */
