package com.tech.one1.arraysample;

import java.util.Arrays;
import java.util.Random;

public class LottoArray {
	public static void main(String[] args) {
		// 1~45������ ���� �� 6���� ����
		// �ζ� ��ȣ ����
		int[] arr = new int[6];
		Random r = new Random(); // �������� ��ȣ �����ϱ� ����

		for (int i = 0; i < arr.length; i++) {
//			int rNum = r.nextInt(45) + 1;// 1~45 (random���� �޴� ������ ����)
//			arr[i] = rNum; // for���� ���鼭 �迭�� �������� ��ȣ ����

			arr[i] = r.nextInt(45) + 1; // ���� ������ �ϳ��� ǥ�����ذ�

		}
		// ���
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.println();

		// �������� ','�� ���� �ʹٸ�?
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) // ������ �ε���
				System.out.print(arr[i]);
			else
				System.out.print(arr[i] + ",");
		}
		System.out.println();
		
		// Arrays Ŭ������ ����� ���
		System.out.println(Arrays.toString(arr));

	}

}
