package com.tech.one2;

import java.util.Scanner;

public class CharMission3 {
	public static void main(String[] args) {
		// ���� ���ѹݺ�������,q�Է½� ����

		while (true) {

			System.out.print("�ֹι�ȣ 13�ڸ��� �Է��ϼ���.(�����q)>");
			Scanner scan = new Scanner(System.in);
		
			String s=scan.nextLine(); //���� �Ǵ� ���ؼ�			
			
			if (s.equals("q")) { //���� �������� ���� �Ǵ�
				System.out.println("����");
				break;
			}
			
			char socialNum = s.charAt(7); // ȭ�鿡�� ������ s�� �־��༭ s���� char�� �̾������
			
			switch (socialNum) {
			case '1':
			case '3':
			case '5':
				System.out.println("����");
				break;

			case '2':
			case '4':
			case '6':
				System.out.println("����");
				break;
			default:
				System.out.println("�߸��Է�");

			}

		}

	}

}
