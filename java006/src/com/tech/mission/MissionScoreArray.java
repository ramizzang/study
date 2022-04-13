package com.tech.mission;

import java.util.Arrays;
import java.util.Scanner;

public class MissionScoreArray {
//	�迭�� ����� ������ ����,���,�ְ�����,���������� ���
//	---------------------------
//	0��° ���� �Է� or ��� ���� �Է�
//	-
//	-
//	-
//	4��° ���� �Է�
//	
//	�Է��� ������ ������ ����
//	�Է��� ���� ��� / ��� : ���� ������ ���
//	���
//	�ְ�����
//	��������	
	// tbasic@daum.net ���� : ����_0412_�ΰ���

	public static void main(String[] args) {

		// ���� �Է� �ޱ�
		// �ʿ��� �迭 int[] score = new int[5]; //���� ����

		Scanner scan = new Scanner(System.in);
		int[] score = new int[5];

		for (int i = 0; i < score.length; i++) {
			System.out.printf("%d��° ���� ���� �Է� > \n", i);
			score[i] = scan.nextInt();
		}
		System.out.print("�Է��� ������ ������ �����ϴ�.\n" + Arrays.toString(score));
		System.out.println();

		//�Է��� ���� ����,�ְ���,������,��� ���ϱ�

		int sum = 0; // �հ�
		float avg=0.0f;
		int min = score[0]; // ������
		int max = score[0]; // �ְ���

		for (int i = 0; i < score.length; i++) {
			sum += score[i]; // �հ�
			if (min > score[i]) // �ּҰ�
				min = score[i];
			if (max < score[i]) // �ִ밪
				max = score[i];
		}

		avg = (float) sum / score.length; // ���

		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);
		System.out.println("�ְ����� : " + max);
		System.out.println("�������� : " + min);

	}// main end

}// class end
