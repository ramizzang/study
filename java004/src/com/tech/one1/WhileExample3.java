package com.tech.one1;

import java.util.Scanner;

public class WhileExample3 {
	public static void main(String[] args) {
		
		//ȭ�鿡�� �Է¹ޱ�
				
		System.out.println("�޼����� �Է��ϼ��� > ");
		
		Scanner scanner = new Scanner(System.in); //scaner��ü����
		String inputstr=scanner.nextLine(); //ȭ�鿡�� ���� ������ inputstr�� ����
		
//		System.out.println("���α׷� ��� : " + inputstr);
		
		if(inputstr.equals("hey")) {
			System.out.println("prog : hi");
		}
		if(inputstr=="hey") {
			System.out.println("prog : hi");
		}		
		
	}//main end

}//class end
