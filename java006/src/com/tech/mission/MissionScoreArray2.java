package com.tech.mission;

import java.util.Arrays;
import java.util.Scanner;

public class MissionScoreArray2 {
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

		// ���� �Է� �ޱ� ȫ�浿 �����Է�

		Scanner scan = new Scanner(System.in);

		String[] subject = { "����", "����", "����", "����", "��ȸ" };
		int score[] = new int[subject.length];

		for (int i = 0; i < subject.length; i++) {
			System.out.printf("%s ���� ���� �Է� > \n", subject[i]);
			score[i] = scan.nextInt();
		}
		
		//��������ϱ�
		System.out.println("�Է��� ������ ������ �����ϴ�.\n");

		for (int j = 0; j < subject.length; j++) {
			if (j == 0)
				System.out.print("[" + subject[j] + " : " + score[j] + ", ");
			else if (j == subject.length - 1)
				System.out.print(subject[j] + " : " + score[j] + "]");
			else
				System.out.print(subject[j] + " : " + score[j] + ", ");
		}
		System.out.println();
		
		//���� �� ���,�ְ���,�ּ������ϱ�
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
