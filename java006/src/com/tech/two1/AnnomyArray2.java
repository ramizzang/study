package com.tech.two1;

import java.util.Arrays;

public class AnnomyArray2 {
	
	public static void main(String[] args) {
		//����迭
		
		//ȣ�� println �ȿ� sum �Լ��� �Ʒ� sum�� ����� ���� ȣ���Ͽ� ����� return�� ��ȯ
		System.out.println("sum : "+ sum(new int[] {5,5,5,5,5}));
			
	}
	//�� �ڵ�� ������
	private static int sum(int[] arrs) { //�Լ�
		System.out.println("ȣ�� ��~ �հ豸�Ұ�");
		int total=0;
		for (int i = 0; i < arrs.length; i++) {
			total += arrs[i];
		}
		return total;
	}

}
