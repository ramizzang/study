package com.tech.one2;

import java.util.Scanner;

public class CharMission1 {
	public static void main(String[] args) {
		//�ֹι�ȣ�� �Է¹޾Ƽ�, switch������, ����)1,3,5 ����)2,4,6
		
		//�ֹι�ȣ �Է¹ޱ�
		System.out.print("�ֹι�ȣ 13�ڸ��� �Է��ϼ���.>");
		Scanner scan = new Scanner(System.in);
		String socialNum=scan.nextLine();
		System.out.println(socialNum);
		
		//���� ���� �Ǵ� (941222_1234567)(7)
		char ch=socialNum.charAt(7);
		
		
		switch(ch) {
			case'1': case'3': case '5':
				System.out.println("����");
				break;
			
			case'2': case'4': case '6':
				System.out.println("����");
				break;
			default:
				System.out.println("�߸��Է�");
		
		}
		
				
	}
	

}
