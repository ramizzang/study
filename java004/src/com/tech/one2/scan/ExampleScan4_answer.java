package com.tech.one2.scan;

import java.util.Random;
import java.util.Scanner;

public class ExampleScan4_answer {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Random ran = new Random();

		while (true) {
			System.out.println("***�ֻ�������***");
			System.out.println("���� �ֻ��� ����>");
			String userStr = s.nextLine();
			boolean boolstr = userStr.equals("q") || userStr.equals("1") || userStr.equals("2") || userStr.equals("3")
					|| userStr.equals("4") || userStr.equals("5") || userStr.equals("6");

			if (userStr.equals("q")) {
				break;
			} else if (!boolstr) {
				System.out.println("�߸��Է� ���Ӱ��");
				continue;
			}

			int userNum = Integer.parseInt(userStr); // �Է¹��� ���ڸ� ���ڷ� ��ȯ

			// �Է¹��� 1~6,q�� �ƴϸ� false
			boolean bool = 1 <= userNum && userNum >= 6;

			System.out.println("�� �ֻ��� ����");
			int comNum = ran.nextInt(6) + 1;

			if (!bool) {
				System.out.println("�߸��Է� ���Ӱ��");
				continue;
			}

			// ����
			if (userNum == comNum) {
				System.out.printf("user=%d : com=%d, ���º��Դϴ�.%n", userNum, comNum);
			} else if (userNum > comNum) {
				System.out.printf("user=%d : com=%d, user �¸��Դϴ�.%n", userNum, comNum);
			} else {
				System.out.printf("user=%d : com=%d, com �¸��Դϴ�.%n", userNum, comNum);
			}

		} // while end

	}// main end

}// class end
