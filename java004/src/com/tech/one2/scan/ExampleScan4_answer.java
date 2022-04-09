package com.tech.one2.scan;

import java.util.Random;
import java.util.Scanner;

public class ExampleScan4_answer {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Random ran = new Random();

		while (true) {
			System.out.println("***주사위놀이***");
			System.out.println("영구 주사위 굴려>");
			String userStr = s.nextLine();
			boolean boolstr = userStr.equals("q") || userStr.equals("1") || userStr.equals("2") || userStr.equals("3")
					|| userStr.equals("4") || userStr.equals("5") || userStr.equals("6");

			if (userStr.equals("q")) {
				break;
			} else if (!boolstr) {
				System.out.println("잘못입력 게임계속");
				continue;
			}

			int userNum = Integer.parseInt(userStr); // 입력받은 문자를 숫자로 반환

			// 입력받은 1~6,q가 아니면 false
			boolean bool = 1 <= userNum && userNum >= 6;

			System.out.println("컴 주사위 굴려");
			int comNum = ran.nextInt(6) + 1;

			if (!bool) {
				System.out.println("잘못입력 게임계속");
				continue;
			}

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
