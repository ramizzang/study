package com.tech.one1.arraysample;

import java.util.Arrays;
import java.util.Random;

public class LottoArray {
	public static void main(String[] args) {
		// 1~45까지의 숫자 중 6개의 숫자
		// 로또 번호 추출
		int[] arr = new int[6];
		Random r = new Random(); // 랜덤으로 번호 추출하기 위해

		for (int i = 0; i < arr.length; i++) {
//			int rNum = r.nextInt(45) + 1;// 1~45 (random으로 받는 숫자의 범위)
//			arr[i] = rNum; // for문이 돌면서 배열에 랜덤으로 번호 저장

			arr[i] = r.nextInt(45) + 1; // 위에 두줄을 하나로 표현해준거

		}
		// 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.println();

		// 마지막에 ','를 빼고 싶다면?
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) // 마지막 인덱스
				System.out.print(arr[i]);
			else
				System.out.print(arr[i] + ",");
		}
		System.out.println();
		
		// Arrays 클래스를 사용한 출력
		System.out.println(Arrays.toString(arr));

	}

}
