package com.tech.one1;

import java.util.Scanner;

public class WhileExample3 {
	public static void main(String[] args) {
		
		//화면에서 입력받기
				
		System.out.println("메세지를 입력하세요 > ");
		
		Scanner scanner = new Scanner(System.in); //scaner객체생성
		String inputstr=scanner.nextLine(); //화면에서 받은 내용을 inputstr에 저장
		
//		System.out.println("프로그램 대답 : " + inputstr);
		
		if(inputstr.equals("hey")) {
			System.out.println("prog : hi");
		}
		if(inputstr=="hey") {
			System.out.println("prog : hi");
		}		
		
	}//main end

}//class end
