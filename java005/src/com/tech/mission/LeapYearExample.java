package com.tech.mission;

import java.util.*;

public class LeapYearExample {
	// 윤년 - 4년에 하루씩 윤날 추가(2월 29일~)
	// 연수가 4로 나누어 떨어지는 해는 윤년
	// 연수가 4, 100으로 나누어 떨어지는 해는 평년
	// 연수가 4, 100, 400으로 나누어 떨어지는 해는 윤년

	// 연도를 입력받아 윤년 or 평년 인지 판단
	// 제목 0411_윤년_민가람, 금일 12시까지

	public static void main(String[] args) {

		// 1.화면에서 입력받기
		System.out.println("알고싶은 년도를 입력하세요~");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt(); // 입력받은 값을 정수로 변환하여 저장

		// 윤년의 조건 연수가 4로 나누어진다. 또는 4,100,400으로 나누어 떨어진다
		// 평년의 조건 연수가 4,100으로 나누어 떨어진다. 윤년의 조건을 제외한 나머지

//		if (year % 4 == 0 || year % 4 == 0 && year % 100 == 0 && year % 400 == 0)
//			System.out.printf("%d년은 윤년입니다.",year);
//		else if (year % 4 == 0 && year % 100 == 0)
//			System.out.printf("%d년은 평년입니다.",year);
//		else
//			System.out.printf("%d년은 평년입니다.",year);

		// 윤년1 -> 4로 나누어 떨어지지만 100으로 나누어 떨어지면 안됨!
		// 윤년2 -> 4,100,400으로 나누어 떨어져야한다. 4,100으로 나누어 떨어진다는 평년 400으로 떨어지는것만 만족시키자
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			System.out.printf("%d년은 윤년입니다.", year);
		else
			System.out.printf("%d년은 평년입니다.", year);

	}

}
