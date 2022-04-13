package com.tech.one1;

public class ForGuguExample {
	public static void main(String[] args) {
		//구구단 1단이 세로방향으로 출력
		for(int i=1;i<10;i++) {
			for(int j=2;j<10;j++) {
				System.out.printf("%d * %d = %d \t",j,i,i*j); // '\t' 이 각격 맞춰줌
			}
			System.out.println(); //줄바꿈
		}
		
	} // main end

} // class end
