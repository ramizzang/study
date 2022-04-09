package com.tech.one1;

public class ContinueExample {

	public static void main(String[] args) {
		//continue문
		//조건식이 참인 상황을 건너뛰고 다음 문장 진행
		
		for(int i=0;i<10;i++) {
			if(i==5) {
				continue; //i가 5일 때 건너뛰고 다음 문장 진행
			}
			System.out.println("i="+i);
		}
	}

}
