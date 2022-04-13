package com.tech.two1;

public class ForEachExample {
	public static void main(String[] args) {
		
		//int 타입 길이가 5인 배열 numbers 선언 및 초기화
		int[] numbers= {10,50,60,70,20};
		
		//for문 출력
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("==============");
		
		//foreach문 출력
		int sum=0;
		for (int i : numbers) { //numbers에 있는 요소를 순서대로 대입해줌
			sum += i;
			System.out.println(i);			
		}
		System.out.println("sum : "+sum);

	}
	

}
