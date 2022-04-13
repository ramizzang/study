package com.tech.one2;

import java.util.Scanner;

public class CharMission2 {
	public static void main(String[] args) {
		//주민번호를 입력받아서, switch문으로, 남성)1,3,5 여성)2,4,6
		
		//주민번호 입력받기
		System.out.print("주민번호 13자리를 입력하세요.>");
		Scanner scan = new Scanner(System.in);
		char socialNum=scan.next().charAt(7); //char 값으로 바로 받아오기

		
		
		switch(socialNum) {
			case'1': case'3': case '5':
				System.out.println("남성");
				break;
			
			case'2': case'4': case '6':
				System.out.println("여성");
				break;
			default:
				System.out.println("잘못입력");
		
		}
		
				
	}
	

}
