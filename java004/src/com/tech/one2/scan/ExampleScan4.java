package com.tech.one2.scan;

import java.util.Random;
import java.util.Scanner;

public class ExampleScan4 {
	public static void main(String[] args) {
		// 반복문을 사용하여 계속 판정 받기
		// 1~6 q 이외의 문자가 들어오면 판정처리를 하지 않고 잘못입력, 게임계속
		// 주사위를 굴려서(com), 내가 입력하는 숫자와 비교하고 승패를 판단
		
		//str이 1~6일때만 판정을 하면 안됨?

		Scanner s = new Scanner(System.in);
		Random ran = new Random();

		while (true) {
			System.out.println("***주사위놀이***");
			System.out.println("영구 주사위 굴려>");
			String userStr = s.nextLine();
			if (userStr.equals("q")) {
				break;
			}

			int userNum = Integer.parseInt(userStr); // 입력받은 문자를 숫자로 반환
			
			//입력받은 숫자가 1~6 벗어나면 판정 건너뛰기
			
			if	(!(1<=userNum&&userNum<=6)) {
				System.out.println("잘못입력하였습니다.");
				continue;
			}
			
			//
			
			System.out.println("컴 주사위 굴려");
			int comNum = ran.nextInt(6) + 1;
						
			// 판정
			if (userNum == comNum) {
				System.out.printf("user=%d : com=%d, 무승부입니다.%n", userNum, comNum);
			} else if (userNum > comNum) {
				System.out.printf("user=%d : com=%d, user 승리입니다.%n", userNum, comNum);
			} else {
				System.out.printf("user=%d : com=%d, com 승리입니다.%n", userNum, comNum);
			}
		} // while end

	}// main end

}// class end
