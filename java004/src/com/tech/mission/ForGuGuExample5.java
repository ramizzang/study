package com.tech.mission;

import java.util.Scanner;

public class ForGuGuExample5 {

	public static void main(String[] args) {

		// 화면에서 입력받아 n단에서 n단 출력

		// 1. 화면에서 받기
		System.out.print("구구단 n단부터 n단까지 출력할 구간을 입력하세요~!(정수2개 입력)>\n");
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);

		int num1 = scan1.nextInt();
		int num2 = scan2.nextInt();

		// 2. 조건설정
		// 내가 원하는 조건, 일단 와일문으로 구구단 만들기

		// 1)num1==num2일 때
		// 2)num1>num2일 때
		// 3)num1<num2일 때
		if (num1 == num2) {
			System.out.println(num1 + "단만 출력합니다.");
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", num1, i, num1 * i);
			}
		} else if (num1 > num2) { //역순 (입력한대로)
			System.out.printf("%d단에서 %d단까지 출력합니다.%n", num1, num2);
			while (num1 >= num2) {// 몇번 반복해야 될지 모름

				for (int i = 1; i <= 9; i++) {
					System.out.printf("%d * %d = %d\n", num1, i, num1 * i);
				} // for end
				num1--;
				System.out.println();
			}
//		} else if (num1 > num2) {//정순으로 나오는 것도 좋을거 같아서 넣어봤습니다
//			System.out.printf("%d단부터 %d단까지 출력합니다.%n", num2, num1);
//			while (num1 >= num2) {// 몇번 반복해야 될지 모름
//
//				for (int i = 1; i <= 9; i++) {
//					System.out.printf("%d * %d = %d\n", num2, i, num2 * i);
//				} // for end
//				num2++;
//				System.out.println();
//			}
		} else { //num1<num2 일때를 else값으로 정함
			System.out.printf("%d단부터 %d단까지 출력합니다.%n", num1, num2);
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
