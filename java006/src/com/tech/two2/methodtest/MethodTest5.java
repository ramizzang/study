package com.tech.two2.methodtest;

public class MethodTest5 {

	public int makeSum(int pay1, int pay2) { 

		int paysum=0;
		paysum = pay1+pay2;
		return paysum;
		
	} // makeSum end

	public static void main(String[] args) {
		
		MethodTest5 m2 = new MethodTest5(); // 객체생성
		int sum1=m2.makeSum(1000000, 2000000); //makeSum함수 호출
		
		//리턴 받은 값을 판단의 기준으로
		if(sum1>=300000) {
			System.out.println("그래");
		}else {
			System.out.println("생각해볼게");
		}

	} // main end

} // class end
