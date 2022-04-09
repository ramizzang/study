package com.tech.one2.scan;

import java.util.Random;
import java.util.Scanner;

public class ExampleScan3 {
	public static void main(String[] args) {
		// 반복문을 사용하여 계속 판정 받기

		// 주사위를 굴려서(com), 내가 입력하는 숫자와 비교하고 승패 판단.
		Scanner s = new Scanner(System.in);
		Random ran = new Random();

		while (true) {// 무한반복

			System.out.printf("***주사위 놀이***%n(1~6)사이의 값을 입력하세요(프로그램종료는q입력)>");
			String userStr = s.nextLine();
			if (userStr.equals("q")) {
				break;
			}

			int userNum = Integer.parseInt(userStr);

			System.out.println("com 주사위 굴려!");
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

		System.out.println("-주사위 놀이 끝-");

	}// main end

}// class end
