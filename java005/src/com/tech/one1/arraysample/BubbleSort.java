package com.tech.one1.arraysample;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		// bubblesort �����غ���-> https://hsp1116.tistory.com/33
		int[] arr = { 7, 85, 67, 42 };
		int tmp;
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {// �� ���ǿ��� ���� data ��ȯ (arr[0] > arr[1] �̸�)
					tmp = arr[j]; //tmp�� arr[j]�� ���� ����
					arr[j] = arr[j + 1]; // arr[j]�� arr[j+1]�� ���� ����
					arr[j + 1] = tmp; //arr[j+1]�� tmo�� ���� ����(�ᱹ ���� arr[j]�� �ִ� ��)
					
					//�� ������ �ݺ� �ϸ� ���� ���� ���� �������� ������ ���Ľ����ִ°�!
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}// main end
}// class end
