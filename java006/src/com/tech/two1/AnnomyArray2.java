package com.tech.two1;

import java.util.Arrays;

public class AnnomyArray2 {
	
	public static void main(String[] args) {
		//무명배열
		
		//호출 println 안에 sum 함수가 아래 sum에 저장된 식을 호출하여 계산후 return값 반환
		System.out.println("sum : "+ sum(new int[] {5,5,5,5,5}));
			
	}
	//이 코드는 다음에
	private static int sum(int[] arrs) { //함수
		System.out.println("호출 완~ 합계구할게");
		int total=0;
		for (int i = 0; i < arrs.length; i++) {
			total += arrs[i];
		}
		return total;
	}

}
