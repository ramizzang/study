package com.tech.two2.methodtest;

public class MethodTest2 {
//	void : return 값이 없다 (반환받는 값이 없다)
	
	//sum을 만들기 위한 함수 makeSum
	public void makeSum() {
		
		int start=0;
		int end=100;
		int sum=0;
		
		for (int i=start; i<=end; i++) {
			sum += i;
		}
		System.out.println("sum = "+sum);
	} //makeSum end
	
	public static void main(String[] args) {

		MethodTest2 m2 = new MethodTest2(); // 객체생성
		m2.makeSum();//makesum 함수 호출
		m2.makeSum();//makesum 함수 호출
		m2.makeSum();//makesum 함수 호출


	} // main end

} // class end
