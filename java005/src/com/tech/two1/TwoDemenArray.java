package com.tech.two1;

import java.util.Arrays;

public class TwoDemenArray {
	public static void main(String[] args) {
		// ������ �迭
		// ����
		int[][] arr = new int[4][3]; // ��� Ÿ��[][] �迭��=new Ÿ��[n��][n��] �̶�� ����! ��:row, ��:colrow

		// ����� �ʱ�ȭ ���ÿ�
		int[][] array = { // ��ǥ��ó�� �����ϸ�
				{ 10, 11 }, // (0,0/0,1)
				{ 20, 21, 22 }, // (1,0/1,1/1,2)
				{ 30 }, // (2,0)
				{ 40, 41, 42 } // (3,0/3,1/3,2)
		};
		System.out.println(array[1][2]);
		// ������
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(array.length); // ������ �迭���� ���� ����
		System.out.println(array[0].length); // ������ �迭���� ���� ���� ���� ����
		
	}

}
