package com.tech.two.fortest;

public class ForExample2 {

	public static void main(String[] args) {
		
		//짝수의 합 누적
		
		int sum=0;
		for(int i=0; i<=100; i++) {
			if(i%2==0) // 2의 배수일때 (짝수일때,2로나눈 나머지가 0일때)
				sum += i;
		}
		
		System.out.println(sum);
		
	}//main end

}//class end
