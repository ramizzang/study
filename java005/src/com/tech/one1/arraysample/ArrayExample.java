package com.tech.one1.arraysample;

import java.util.Scanner;

public class ArrayExample {
	public static void main(String[] args) {
		//�迭�� ����
		int[] arr=new int[5]; // �迭��Ÿ��[] �迭���̸�=new Ÿ��[����];
		
		//�迭�� �������ָ� �˾Ƽ� �� Ÿ���� �⺻������ �ʱ�ȭ ���ش�.
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		//�迭�� ��ҿ� ������ �־��ֱ�
		arr[0]=100;
		System.out.println(arr[0]); //0->100���� �ٲ�
		arr[4]=500;
		System.out.println(arr[4]); //0->500���� �ٲ�
//		System.out.println(arr[5]); //error (Index 5 out of bounds for length 5)�޼��� �� �ֳĸ� ���̰� 5�� �迭�� �ε��� �ѹ���0~4����!
		
		//��ĳ�ʸ� �̿��� ������ �Է�		
//		Scanner scan=new Scanner(System.in);
//		arr[0]=scan.nextInt();
		System.out.println(arr[0]);
		
		//�迭�� ������� �迭�̸�.length
		System.out.println("�迭�� ���� : "+arr.length); // �迭 arr�� ����
		for (int i = 0; i < arr.length; i++) {
			System.out.println("�ݺ�");
		}
		
		//�迭�� for���� �̿��� ���
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]); // ���� i�� ���� ���ϸ鼭 �� ��Ҹ� ���		
		}
		
	}

}
