package com.tech.one1;

public class DoWhileExample {
	public static void main(String[] args) {
		
		int i=1;
		int sum=0;
		while(i<=10) {
			sum += i;
			i++;
		}
		System.out.println("sum = "+sum);
		
		//Do while문_적어도 한번은 실행 후 조건 판단
		int j=1;
		do {
			System.out.println("j="+j);
			j++;
		} while (j<1);
		
		//while문 : 조건을 비교 후 반복 (실행을 할 수도 안 할 수도 있음)
		//do while문 : 적어도 1회 실행 후 조건을 비교 반복(1회는 무조건 실행)
		
	}//main end

}//class end
