package com.tech.one1.arraysample;

import java.util.Scanner;

public class ArrayExample3 {
	public static void main(String[] args) {
		// �迭�� �հ�,��� ���ϱ�
		int[] score = { 100, 90, 80, 73, 90 };
		int sum = 0;
		float avg = 0.0f;

		// �հ���
		for (int i = 0; i < score.length; i++) {
			sum += score[i]; // sum�� �迭�� �� ��ҵ��� ���� ��������
		}

		// ��հ��
		avg = sum / (float) score.length; // �հ� ���� ����� ���ϱ� ���� �迭�� ���̷� ���� ��!
		System.out.println("sum = " + sum);
		System.out.println("avg = " + avg);

	}

}
