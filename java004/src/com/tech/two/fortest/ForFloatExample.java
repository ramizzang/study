package com.tech.two.fortest;

public class ForFloatExample {

	public static void main(String[] args) {
		
		// 실수 자료형의 오차-부동소수점 
		// https://8iggy.tistory.com/232 참고

		for (float x = 0.1f; x <= 1.0f; x = x + 0.1f) {
			System.out.println("x = " + x);
		}

		System.out.println("======================");

		for (float x = 0.1f; x <= 1.0f; x = x + 0.1f) {
			System.out.printf("%5.2f\n", x);
			// printf (), %n1.n2f -> n1:출력되는 자리를 차지하는 수, n2:소수점 n번째까지 출력해라
		}

		System.out.println("======================");

		for (float x = 0.1f; x <= 1.0f; x = x + 0.1f) {
			System.out.printf("%.2f\n", x);
		}
		
		// frintf()문과 지시자
		
		int num=100;
		String str="구디역";
		char ch='굳';
		
		System.out.printf("num : %d \n",num); 
		System.out.printf("str : %s \n",str);
		System.out.printf("c : %c \n",ch);
		System.out.printf("구트는 %s에 있는 %d%% %c",str,num,ch);
		// %d = 정수, %s = 문자열, %c = 유니코드'문자', %%->이스케이프문으로 %표시하고 싶으면 %%써줘야함
		

	}// main end

}// class end
