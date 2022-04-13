package com.tech.two1;

public class MinSample {
	public static void main(String[] args) {
		// 배열에서 최소값 최대값 구하기
		int min = 100; // 점수의 최대값을 최소값으로 잡아주고
		int[] arr = { 80, 40, 70, 20, 30 }; // 시험점수라고 생각

		// 최소값 검사
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) // 만약 min>arr[i] 이면 min 값을 arr[i] 값으로 변경! -> for문 진행되면서 제일 작은 값이 결국 min값에 저장!
				min = arr[i];
			System.out.println("min=" + min);

		}
		System.out.println("min : " + min);
	}
}
