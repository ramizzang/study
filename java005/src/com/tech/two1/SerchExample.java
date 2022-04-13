package com.tech.two1;

import java.util.Scanner;

public class SerchExample {
	public static void main(String[] args) {
		//배열에서 찾는 값의 위치를 알아내기
		//일차원배열
		int[] arr= {0,10,20,30,40,50,60,70,80,90,100};
		
//		int value; // 선언만 해줘도 오류 안나는 이유는 아래 스캐너를 통해 초기화 해주기 때문!
//		int index=-1;
		int value,index=-1; // 위에 두줄 한줄로 
		
		Scanner scan=new Scanner(System.in);
		System.out.println("탐색값을 입력하세요.");
		value=scan.nextInt(); //스캐너를 통해 받은 값을 int로 받음
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==value) {
				index=i;
			}
		}
		System.out.println(value+"값은"+(index+1)+"번째 위치합니다."); //인덱스넘버 0부터 시작이라 +1 해줌
		
	}

}
