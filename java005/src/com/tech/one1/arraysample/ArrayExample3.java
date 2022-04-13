package com.tech.one1.arraysample;

import java.util.Scanner;

public class ArrayExample3 {
	public static void main(String[] args) {
		// 배열의 합계,평균 구하기
		int[] score = { 100, 90, 80, 73, 90 };
		int sum = 0;
		float avg = 0.0f;

		// 합계계산
		for (int i = 0; i < score.length; i++) {
			sum += score[i]; // sum에 배열의 각 요소들의 값을 누적해줌
		}

		// 평균계산
		avg = sum / (float) score.length; // 합계 값을 평균을 구하기 위해 배열의 길이로 나눠 줌!
		System.out.println("sum = " + sum);
		System.out.println("avg = " + avg);

	}

}
