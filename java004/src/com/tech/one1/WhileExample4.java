package com.tech.one1;

import java.util.Scanner;

public class WhileExample4 {
	public static void main(String[] args) {
		
		//ȭ�鿡�� �Է¹ޱ�
				
		System.out.println("�޼����� �Է��ϼ��� > ");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ��� > ");
		Scanner scanner = new Scanner(System.in); //scaner��ü����
		String inputstr=""; 
		
		do {
			inputstr=scanner.nextLine();//�����Է�
			System.out.println("msg : " + inputstr);
			
		}while(!inputstr.equals("q"));
		System.out.println("���α׷� ��");
	}//main end

}//class end
