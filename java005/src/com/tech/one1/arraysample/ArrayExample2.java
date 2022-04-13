package com.tech.one1.arraysample;

import java.util.Scanner;

public class ArrayExample2 {
	public static void main(String[] args) {
		//배열의 선언
		int[] arr=new int[5]; // 배열의 초기값이 각 타입의 디폴드 값
		int[] arr2= {10,20,30,40,50}; // 배열의 선언과 초기화를 동시에 int arr2[] 처럼 []위치 뒤로가도 ok
		// arr2[0]=10; arr2[1]=20; ....arr2[4]=50; 과 같음
		System.out.println(arr2.length);
		
		//for문을 이용한 출력
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}		
			
	}

}
