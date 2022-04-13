package com.tech.one1;

import java.util.Arrays;

public class TwoDemenArray3 {
	public static void main(String[] args) {
		//이차원 배열의 초기화
		//for문 이용		
		//5,4 차원 배열을 만들어 1부터 1씩 증가한 값을 배열에 대입하고 모두출력
		
		int[][] arr=new int[5][4];
		int cnt=1;
		
		//배열의 입력
		for (int i = 0; i < arr.length; i++) {			
			for (int j = 0; j < arr[i].length; j++) {
//				arr[i][j]=cnt;
//				cnt=cnt+1;				
				arr[i][j]=cnt++; //cnt 값은 for문 진행하면서 1씩 증가된 값이 누적		
			}

		}
							
		//출력문
		for (int i = 0; i < arr.length; i++) {			
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t"); //출력문
			}
			System.out.println();
		}
				
	}
}
