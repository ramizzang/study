package com.tech.mission;

import java.util.*;

public class ForGuGuExample2 {

	public static void main(String[] args) {		
		//missio1_숫자를 입력받아서 입력받은 단을 출력
		
		//화면으로 입력받기
		System.out.println("출력하고 싶은 단을 입력하세요~!(정수만 입력)>");
		Scanner scan1=new Scanner(System.in);
		
		//입력받은 문자열을 int형 변수에 저장하기
		int num1=scan1.nextInt();
		
		System.out.printf("%d단을 출력합니다.%n",num1);
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", num1,i,i*num1);	
		}
			
	}//main end

}//class end
