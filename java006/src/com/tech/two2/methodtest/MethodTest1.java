package com.tech.two2.methodtest;

public class MethodTest1 {
//	void : return 값이 없다 (반환받는 값이 없다)
	
	public static void main(String[] args) {

		MethodTest1 m1 = new MethodTest1(); // 객체생성
		m1.makeSum();//makesum 함수 호출

	} // main end
	
	//method 선언 위치는 main 위,아래 어디든 상관 없음
	public void makeSum() { // 함수의 형식 public void 함수명(){}
		System.out.println("호출완");

	} // makeSum end

} // class end
