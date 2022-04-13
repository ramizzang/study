package com.tech.one2;

import java.util.Scanner;

public class CharMission3 {
	public static void main(String[] args) {
		// 판정 무한반복문으로,q입력시 종료

		while (true) {

			System.out.print("주민번호 13자리를 입력하세요.(종료는q)>");
			Scanner scan = new Scanner(System.in);
		
			String s=scan.nextLine(); //종료 판단 위해서			
			
			if (s.equals("q")) { //먼저 종료할지 말지 판단
				System.out.println("종료");
				break;
			}
			
			char socialNum = s.charAt(7); // 화면에서 받은걸 s로 넣아줘서 s에서 char값 뽑아줘야함
			
			switch (socialNum) {
			case '1':
			case '3':
			case '5':
				System.out.println("남성");
				break;

			case '2':
			case '4':
			case '6':
				System.out.println("여성");
				break;
			default:
				System.out.println("잘못입력");

			}

		}

	}

}
