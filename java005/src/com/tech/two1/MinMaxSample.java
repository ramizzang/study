package com.tech.two1;

public class MinMaxSample {
	public static void main(String[] args) {
		// 배열에서 최소값 최대값 구하기
//		int min = 100; // 점수의 최대값을 최소값으로 잡아주고
//		int max = 0;
		int[] arr = { 50, 40, 70, 20, 30 }; // 시험점수라고 생각
		int min = arr[0]; // 결국 기존값이랑 계속 비교하면서 치환되는거!! 그래서 index0으로 잡아줌!
		int max = arr[0];

		// 최소값 검사
		for (int i = 0; i < arr.length; i++) {
			// 계속 min,max 값과 비교하면서 값을 변경해주는 거!!!!
			if (min > arr[i]) // 만약 min>arr[i] 이면 min 값을 arr[i] 값으로 변경! -> for문 진행되면서 제일 작은 값이 결국 min값에 저장!
				min = arr[i];
			if (max < arr[i]) // else if 쓰면 안들어 갈거 같아서 이렇게 해봄!
				max = arr[i]; // max<arr[i] 이면 max 값을 arr[i] 값으로 변경
			System.out.println("min=" + min + " max=" + max);
		}
		System.out.println("min : " + min + " max : " + max);
	}

}
