package com.tech.one1;

import java.util.Scanner;

public class WhileExample4 {
	public static void main(String[] args) {
		
		//화면에서 입력받기
				
		System.out.println("메세지를 입력하세요 > ");
		System.out.println("프로그램을 종료하려면 q를 입력하세요 > ");
		Scanner scanner = new Scanner(System.in); //scaner객체생성
		String inputstr=""; 
		
		do {
			inputstr=scanner.nextLine();//문자입력
			System.out.println("msg : " + inputstr);
			
		}while(!inputstr.equals("q"));
		System.out.println("프로그램 끝");
	}//main end

}//class end
