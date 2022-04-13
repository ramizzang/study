package com.tech.two1;

public class TriOperExample {
	public static void main(String[] args) {
		// 삼항연산자 ( ? : )
//		int result=(조건식)? 참일때: 거짓일때; //반환받는 값은 같은 타입이어야 한다.

		int a = (10 < 5) ? 10 : 20;
		System.out.println(a);

		String a2 = (10 < 5) ? "맞다" : "틀리다";
		System.out.println(a2);

	}
}
