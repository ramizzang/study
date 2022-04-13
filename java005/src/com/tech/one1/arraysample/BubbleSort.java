package com.tech.one1.arraysample;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		// bubblesort 참고해보기-> https://hsp1116.tistory.com/33
		int[] arr = { 7, 85, 67, 42 };
		int tmp;
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {// 이 조건에서 서로 data 교환 (arr[0] > arr[1] 이면)
					tmp = arr[j]; //tmp에 arr[j]의 값을 저장
					arr[j] = arr[j + 1]; // arr[j]에 arr[j+1]의 값을 저장
					arr[j + 1] = tmp; //arr[j+1]에 tmo의 값을 저장(결국 원래 arr[j]에 있던 값)
					
					//위 과정을 반복 하며 가장 작은 수가 왼쪽으로 오도록 정렬시켜주는거!
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}// main end
}// class end
