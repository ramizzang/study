package com.tech.mission;

import java.util.Scanner;

public class ForGuGuExample5 {

	public static void main(String[] args) {

		// ȭ�鿡�� �Է¹޾� n�ܿ��� n�� ���

		// 1. ȭ�鿡�� �ޱ�
		System.out.print("������ n�ܺ��� n�ܱ��� ����� ������ �Է��ϼ���~!(����2�� �Է�)>\n");
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);

		int num1 = scan1.nextInt();
		int num2 = scan2.nextInt();

		// 2. ���Ǽ���
		// ���� ���ϴ� ����, �ϴ� ���Ϲ����� ������ �����

		// 1)num1==num2�� ��
		// 2)num1>num2�� ��
		// 3)num1<num2�� ��
		if (num1 == num2) {
			System.out.println(num1 + "�ܸ� ����մϴ�.");
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", num1, i, num1 * i);
			}
		} else if (num1 > num2) { //���� (�Է��Ѵ��)
			System.out.printf("%d�ܿ��� %d�ܱ��� ����մϴ�.%n", num1, num2);
			while (num1 >= num2) {// ��� �ݺ��ؾ� ���� ��

				for (int i = 1; i <= 9; i++) {
					System.out.printf("%d * %d = %d\n", num1, i, num1 * i);
				} // for end
				num1--;
				System.out.println();
			}
//		} else if (num1 > num2) {//�������� ������ �͵� ������ ���Ƽ� �־�ý��ϴ�
//			System.out.printf("%d�ܺ��� %d�ܱ��� ����մϴ�.%n", num2, num1);
//			while (num1 >= num2) {// ��� �ݺ��ؾ� ���� ��
//
//				for (int i = 1; i <= 9; i++) {
//					System.out.printf("%d * %d = %d\n", num2, i, num2 * i);
//				} // for end
//				num2++;
//				System.out.println();
//			}
		} else { //num1<num2 �϶��� else������ ����
			System.out.printf("%d�ܺ��� %d�ܱ��� ����մϴ�.%n", num1, num2);
			while (num1 <= num2) {

				for (int i = 1; i <= 9; i++) {
					System.out.printf("%d * %d = %d\n", num1, i, num1 * i);
				} // for end
				num1++;
				System.out.println();
			}
		} // end(num1<num2)

	}// class end

}// main end
