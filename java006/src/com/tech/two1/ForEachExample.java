package com.tech.two1;

public class ForEachExample {
	public static void main(String[] args) {
		
		//int Ÿ�� ���̰� 5�� �迭 numbers ���� �� �ʱ�ȭ
		int[] numbers= {10,50,60,70,20};
		
		//for�� ���
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("==============");
		
		//foreach�� ���
		int sum=0;
		for (int i : numbers) { //numbers�� �ִ� ��Ҹ� ������� ��������
			sum += i;
			System.out.println(i);			
		}
		System.out.println("sum : "+sum);

	}
	

}
