package com.tech.one1.arraysample;

import java.util.Scanner;

public class ArrayExample2 {
	public static void main(String[] args) {
		//�迭�� ����
		int[] arr=new int[5]; // �迭�� �ʱⰪ�� �� Ÿ���� ������ ��
		int[] arr2= {10,20,30,40,50}; // �迭�� ����� �ʱ�ȭ�� ���ÿ� int arr2[] ó�� []��ġ �ڷΰ��� ok
		// arr2[0]=10; arr2[1]=20; ....arr2[4]=50; �� ����
		System.out.println(arr2.length);
		
		//for���� �̿��� ���
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}		
			
	}

}
