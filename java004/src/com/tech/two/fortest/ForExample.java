package com.tech.two.fortest;

public class ForExample {

	public static void main(String[] args) {
		
		int sum=0;
		for(int i=0; i<10; i++) {
			//합계
			sum += i;
			System.out.println("sum="+sum+" i="+i);
		}
		
		System.out.println("sum="+sum);
		
		//시작값 끝값 추가
		int start=1;
		int end=100;
		for (int i=start;i<=end;i++) {
			sum += i;
		}
		
		System.out.println(start+"+"+end+"="+sum);

	}//main end

}//class end
