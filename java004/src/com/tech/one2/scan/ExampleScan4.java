package com.tech.one2.scan;

import java.util.Random;
import java.util.Scanner;

public class ExampleScan4 {
	public static void main(String[] args) {
		// �ݺ����� ����Ͽ� ��� ���� �ޱ�
		// 1~6 q �̿��� ���ڰ� ������ ����ó���� ���� �ʰ� �߸��Է�, ���Ӱ��
		// �ֻ����� ������(com), ���� �Է��ϴ� ���ڿ� ���ϰ� ���и� �Ǵ�
		
		//str�� 1~6�϶��� ������ �ϸ� �ȵ�?

		Scanner s = new Scanner(System.in);
		Random ran = new Random();

		while (true) {
			System.out.println("***�ֻ�������***");
			System.out.println("���� �ֻ��� ����>");
			String userStr = s.nextLine();
			if (userStr.equals("q")) {
				break;
			}

			int userNum = Integer.parseInt(userStr); // �Է¹��� ���ڸ� ���ڷ� ��ȯ
			
			//�Է¹��� ���ڰ� 1~6 ����� ���� �ǳʶٱ�
			
			if	(!(1<=userNum&&userNum<=6)) {
				System.out.println("�߸��Է��Ͽ����ϴ�.");
				continue;
			}
			
			//
			
			System.out.println("�� �ֻ��� ����");
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

	}// main end

}// class end
