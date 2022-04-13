package com.tech.one1;

public class ForGuguExample2 {
	public static void main(String[] args) {
		//구구단 1단씩 가로방향으로 출력
		//2*1=2 2*2=4 2*3=6...
		//3*1=3 3*2=6 ......
		for(int i=2;i<10;i++) { //조건처럼 나오려면 얘가 단의 역할!
			for(int j=1;j<10;j++) {
				System.out.printf("%d * %d = %d \t",i,j,i*j); // '\t' 이 각격 맞춰줌
			}
			System.out.println(); //줄바꿈
		}
		//안쪽 for문은 바깥 for문이 값을 가질때 안쪽 for문의 조건식 만큼 돌고 나옴
		//안쪽 for문을 벗어나면 줄바꿈이 일어나게 해주는거!
		
		
	} // main end

} // class end
