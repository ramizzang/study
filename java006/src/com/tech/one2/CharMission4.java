package com.tech.one2;

import java.util.Scanner;

public class CharMission4 {
	public static void main(String[] args) {
		// ���� ���ѹݺ�������,q�Է½� ����
		// do while�� ���

		Scanner scan = new Scanner(System.in);

		String resiNum;
		
		do {
			System.out.println("�ֹι�ȣ�� �Է��ϼ���, ���ڸ� 13�ڸ�");
			resiNum = scan.nextLine();

			// �ֹι�ȣ ���ڸ� ����
			char a = resiNum.charAt(6);
			System.out.println(a);

			// ��������
			if (a == '1' || a == '3' || a == '5') {
				if (a == '1') {
					System.out.println("�ѱ�����");
				} else if (a == '3') {
					System.out.println("�ѱ����� 2000");
				} else
					System.out.println("�ܱ�����");
			} else if (a == '2' || a == '4' || a == '6') {
				if (a == '2') {
					System.out.println("�ѱ�����");
				} else if (a == '4') {
					System.out.println("�ѱ����� 2000");
				} else
					System.out.println("�ܱ�����");
			}
			System.out.println("================================");
			System.out.println("�������� 'q'�� �Է�, ����Ϸ���'r'�� �Է��ϼ���");
		   
			//���࿩�� ����
			
			resiNum=scan.nextLine();
			if( resiNum.equals("q"))
				System.out.println("���α׷�����");
				break;

		} while (!resiNum.equals("q"));

	}
}
