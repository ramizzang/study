package com.tech.mission;

import java.util.*;

public class LeapYearExample4 { // ����� �ؼ�
		//for������ ����
	public static void main(String[] args) {
			
		// 1.ȭ�鿡�� �Է¹ޱ�
		for ( ; ; ) {

			System.out.println("�˰���� �⵵�� �Է��ϼ���~(0�Է� ����)");
			Scanner scan = new Scanner(System.in);
			int year = scan.nextInt(); // �Է¹��� ���� ������ ��ȯ�Ͽ� ����
			String str = "";

			if (year == 0) { // ���ѷ����� �������ֱ� ����
				System.out.println("���α׷��� �����մϴ�~");
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
