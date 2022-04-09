package com.tech.one1;

public class WhileExample2 {
	public static void main(String[] args) {
				
		int i=1;
		int sum=0; //sum 초기화
		
		while(i<=10) {			
//			int sum=0; // sum이 while문 안에서 초기화 된다면 while문이 실행되는동안 계속 초기화 되서 i값이 누적 되지 않음.
			
			sum += i; //sum -> 1씩 증가된 값을 누적
			i++;
			
		}//while1 end
		
		System.out.println("sum = "+sum);
		
		int j=0;
		
		while(j<=10) {
			//while문이 수행되는 동안 계속 초기화 되서 sum에 j값 누적되지 않음.
			int sum2=0;
			
			sum2 +=j;
			j++;
			
			System.out.printf("sum2=%d, j=%d%n", sum2,j);
		}//while2 end
		
	}//main end

}//class end
