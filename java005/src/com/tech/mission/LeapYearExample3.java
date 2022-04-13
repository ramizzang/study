package com.tech.mission;

import java.util.*;

public class LeapYearExample3 { // 강사님 해설
	// 윤년 - 4년에 하루씩 윤날 추가(2월 29일~)
	// 연수가 4로 나누어 떨어지는 해는 윤년
	// 연수가 4, 100으로 나누어 떨어지는 해는 평년
	// 연수가 4, 100, 400으로 나누어 떨어지는 해는 윤년

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
		// 1.화면에서 입력받기
		while (true) {

			System.out.println("알고싶은 년도를 입력하세요~(0입력 종료)");
			
			int year = scan.nextInt(); // 입력받은 값을 정수로 변환하여 저장
			String str = "";

			if (year == 0) { // 무한루프를 종료해주기 위해
				str = "프로그램을 종료합니다~";
				break;
			} else if (year % 400 == 0) { // 400으로 나누어지는건 4,100 으로도 나누어짐
				str = "윤년400";
			} else if (year % 100 == 0) { // 위에 나머지 중 100 으로 나누어 지는 건 평년
				str = "평년100";
			} else if (year % 4 == 0) { // 위에 나머지 중 4로 나누어 지는거 윤년
				str = "윤년4";
			} else // 위에 해당하지 않는 나머지들은 평년!
				str = "평년";
			System.out.println(str);
		}
		
	}

}
