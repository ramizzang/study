package com.tech.mission;

public class Array_test5 {
	public static void main(String[] args) {
		int arr[]= {100,90,60,70,90,87};
		int sum=0;
		float avg=0f;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
			avg=(float)sum/arr.length;
			
			System.out.println("�ο� : " + arr.length);
			System.out.println("���� : "+sum);
			System.out.println("��� : "+avg);
		
		
	}

}
