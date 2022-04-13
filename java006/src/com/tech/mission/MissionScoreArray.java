package com.tech.mission;

import java.util.Arrays;
import java.util.Scanner;

public class MissionScoreArray {
//	배열에 저장된 점수를 총점,평균,최고점수,최저점수를 출력
//	---------------------------
//	0번째 점수 입력 or 사람 점수 입력
//	-
//	-
//	-
//	4번째 점수 입력
//	
//	입력한 점수는 다음과 같음
//	입력한 점수 출력 / 사람 : 몇점 식으로 출력
//	평균
//	최고점수
//	최저점수	
	// tbasic@daum.net 제목 : 성적_0412_민가람

	public static void main(String[] args) {

		// 점수 입력 받기
		// 필요한 배열 int[] score = new int[5]; //점수 저장

		Scanner scan = new Scanner(System.in);
		int[] score = new int[5];

		for (int i = 0; i < score.length; i++) {
			System.out.printf("%d번째 성적 점수 입력 > \n", i);
			score[i] = scan.nextInt();
		}
		System.out.print("입력한 점수는 다음과 같습니다.\n" + Arrays.toString(score));
		System.out.println();

		//입력한 점수 총점,최고점,최저점,평균 구하기

		int sum = 0; // 합계
		float avg=0.0f;
		int min = score[0]; // 최저점
		int max = score[0]; // 최고점

		for (int i = 0; i < score.length; i++) {
			sum += score[i]; // 합계
			if (min > score[i]) // 최소값
				min = score[i];
			if (max < score[i]) // 최대값
				max = score[i];
		}

		avg = (float) sum / score.length; // 평균

		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("최고점수 : " + max);
		System.out.println("최저점수 : " + min);

	}// main end

}// class end
