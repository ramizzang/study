package com.tech.one1.arraysample;

import java.util.Scanner;

public class ArrayExample {
	public static void main(String[] args) {
		//배열의 선언
		int[] arr=new int[5]; // 배열의타입[] 배열의이름=new 타입[길이];
		
		//배열은 선언해주면 알아서 각 타입의 기본값으로 초기화 해준다.
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		//배열의 요소에 데이터 넣어주기
		arr[0]=100;
		System.out.println(arr[0]); //0->100으로 바뀜
		arr[4]=500;
		System.out.println(arr[4]); //0->500으로 바뀜
//		System.out.println(arr[5]); //error (Index 5 out of bounds for length 5)메세지 뜸 왜냐면 길이가 5인 배열의 인덱스 넘버는0~4까지!
		
		//스캐너를 이용한 데이터 입력		
//		Scanner scan=new Scanner(System.in);
//		arr[0]=scan.nextInt();
		System.out.println(arr[0]);
		
		//배열의 길이출력 배열이름.length
		System.out.println("배열의 길이 : "+arr.length); // 배열 arr의 길이
		for (int i = 0; i < arr.length; i++) {
			System.out.println("반복");
		}
		
		//배열의 for문을 이용한 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]); // 변수 i의 값이 변하면서 각 요소를 출력		
		}
		
	}

}
