package com.tech.mission;

import java.util.*;

public class LeapYearExample2 { // ����� �ؼ�
	// ���� - 4�⿡ �Ϸ羿 ���� �߰�(2�� 29��~)
	// ������ 4�� ������ �������� �ش� ����
	// ������ 4, 100���� ������ �������� �ش� ���
	// ������ 4, 100, 400���� ������ �������� �ش� ����

	public static void main(String[] args) {

		// 1.ȭ�鿡�� �Է¹ޱ�
		while (true) {

			System.out.println("�˰���� �⵵�� �Է��ϼ���~(0�Է� ����)");
			Scanner scan = new Scanner(System.in);
			int year = scan.nextInt(); // �Է¹��� ���� ������ ��ȯ�Ͽ� ����

			if (year == 0) { //���ѷ����� �������ֱ� ����
				break;
			} else if (year % 400 == 0) { // 400���� ���������°� 4,100 ���ε� ��������
				System.out.println("����400");
			} else if (year % 100 == 0) { // ���� ������ �� 100 ���� ������ ���� �� ���
				System.out.println("���100");
			} else if (year % 4 == 0) { // ���� ������ �� 4�� ������ ���°� ����
				System.out.println("����4");
			} else // ���� �ش����� �ʴ� ���������� ���!
				System.out.println("���");

		}

	}

}
