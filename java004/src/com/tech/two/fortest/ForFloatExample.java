package com.tech.two.fortest;

public class ForFloatExample {

	public static void main(String[] args) {
		
		// �Ǽ� �ڷ����� ����-�ε��Ҽ��� 
		// https://8iggy.tistory.com/232 ����

		for (float x = 0.1f; x <= 1.0f; x = x + 0.1f) {
			System.out.println("x = " + x);
		}

		System.out.println("======================");

		for (float x = 0.1f; x <= 1.0f; x = x + 0.1f) {
			System.out.printf("%5.2f\n", x);
			// printf (), %n1.n2f -> n1:��µǴ� �ڸ��� �����ϴ� ��, n2:�Ҽ��� n��°���� ����ض�
		}

		System.out.println("======================");

		for (float x = 0.1f; x <= 1.0f; x = x + 0.1f) {
			System.out.printf("%.2f\n", x);
		}
		
		// frintf()���� ������
		
		int num=100;
		String str="����";
		char ch='��';
		
		System.out.printf("num : %d \n",num); 
		System.out.printf("str : %s \n",str);
		System.out.printf("c : %c \n",ch);
		System.out.printf("��Ʈ�� %s�� �ִ� %d%% %c",str,num,ch);
		// %d = ����, %s = ���ڿ�, %c = �����ڵ�'����', %%->�̽������������� %ǥ���ϰ� ������ %%�������
		

	}// main end

}// class end
