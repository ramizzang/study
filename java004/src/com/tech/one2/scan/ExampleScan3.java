package com.tech.one2.scan;

import java.util.Random;
import java.util.Scanner;

public class ExampleScan3 {
	public static void main(String[] args) {
		// �ݺ����� ����Ͽ� ��� ���� �ޱ�

		// �ֻ����� ������(com), ���� �Է��ϴ� ���ڿ� ���ϰ� ���� �Ǵ�.
		Scanner s = new Scanner(System.in);
		Random ran = new Random();

		while (true) {// ���ѹݺ�

			System.out.printf("***�ֻ��� ����***%n(1~6)������ ���� �Է��ϼ���(���α׷������q�Է�)>");
			String userStr = s.nextLine();
			if (userStr.equals("q")) {
				break;
			}

			int userNum = Integer.parseInt(userStr);

			System.out.println("com �ֻ��� ����!");
			int comNum = ran.nextInt(6) + 1;

			// ����
			if (userNum == comNum) {
				System.out.printf("user=%d : com=%d, ���º��Դϴ�.%n", userNum, comNum);
			} else if (userNum > comNum) {
				System.out.printf("user=%d : com=%d, user �¸��Դϴ�.%n", userNum, comNum);
			} else {
				System.out.printf("user=%d : com=%d, com �¸��Դϴ�.%n", userNum, comNum);
			}
		} // while end

		System.out.println("-�ֻ��� ���� ��-");

	}// main end

}// class end
