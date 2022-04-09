package com.tech.mission;

public class ForGuGuExample {

	public static void main(String[] args) {
		
		//for문으로 5단표현
		for(int i=1;i<=9;i++) {
			System.out.printf("%d * %d = %d\n", 5,i,5*i);
		}
		System.out.println();
				
		
//		//for문으로 구구단 만들기
//		for(int i=2;i<=9;i++) {
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d * %d = %d\n",i,j,i*j);
//			}
//			System.out.println();
//			
//		}
		
		//for문으로 구구단 만들기_이거에서 5단만 나오고 싶어
		for(int i=2;i<=9;i++) {
			if(i==5) {
				for(int j=1;j<=9;j++) {
				System.out.printf("%d * %d = %d\n",i,j,i*j);
				}//중첩for end
			System.out.println();
			} else continue;
			
		}//for end

	}//class end

}//main end
