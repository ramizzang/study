package com.tech.one2;

import java.util.Scanner;

public class CharMission4 {
	public static void main(String[] args) {
		// 판정 무한반복문으로,q입력시 종료
		// do while문 사용

		Scanner scan = new Scanner(System.in);

		String resiNum;
		
		do {
			System.out.println("주민번호를 입력하세요, 숫자만 13자리");
			resiNum = scan.nextLine();

			// 주민번호 앞자리 추출
			char a = resiNum.charAt(6);
			System.out.println(a);

			// 성별구분
			if (a == '1' || a == '3' || a == '5') {
				if (a == '1') {
					System.out.println("한국남성");
				} else if (a == '3') {
					System.out.println("한국남성 2000");
				} else
					System.out.println("외국남성");
			} else if (a == '2' || a == '4' || a == '6') {
				if (a == '2') {
					System.out.println("한국여성");
				} else if (a == '4') {
					System.out.println("한국여성 2000");
				} else
					System.out.println("외국여성");
			}
			System.out.println("================================");
			System.out.println("끝내려면 'q'를 입력, 계속하려면'r'을 입력하세요");
		   
			//진행여부 판정
			
			resiNum=scan.nextLine();
			if( resiNum.equals("q"))
				System.out.println("프로그램종료");
				break;

		} while (!resiNum.equals("q"));

	}
}
