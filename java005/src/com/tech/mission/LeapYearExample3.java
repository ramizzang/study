package com.tech.mission;

import java.util.*;

public class LeapYearExample3 { // ����� �ؼ�
	// ���� - 4�⿡ �Ϸ羿 ���� �߰�(2�� 29��~)
	// ������ 4�� ������ �������� �ش� ����
	// ������ 4, 100���� ������ �������� �ش� ���
	// ������ 4, 100, 400���� ������ �������� �ش� ����

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
		// 1.ȭ�鿡�� �Է¹ޱ�
		while (true) {

			System.out.println("�˰���� �⵵�� �Է��ϼ���~(0�Է� ����)");
			
			int year = scan.nextInt(); // �Է¹��� ���� ������ ��ȯ�Ͽ� ����
			String str = "";

			if (year == 0) { // ���ѷ����� �������ֱ� ����
				str = "���α׷��� �����մϴ�~";
				break;
			} else if (year % 400 == 0) { // 400���� ���������°� 4,100 ���ε� ��������
				str = "����400";
			} else if (year % 100 == 0) { // ���� ������ �� 100 ���� ������ ���� �� ���
				str = "���100";
			} else if (year % 4 == 0) { // ���� ������ �� 4�� ������ ���°� ����
				str = "����4";
			} else // ���� �ش����� �ʴ� ���������� ���!
				str = "���";
			System.out.println(str);
		}
		
	}

}
