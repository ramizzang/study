package com.tech.one1;

import java.util.Arrays;

public class TwoDemenArray4 {
	public static void main(String[] args) {
		//이차원 배열
		//불규칙한 배열의 길이 선언
		//앞에 row의 길이만 정해주면 선언이 된다
		int[][] arr=new int[5][];
		//미정된 colrow의 길이를 결정
		arr[0]=new int[1]; //int[][] arr new int[0][1];
		arr[1]=new int[2];
		arr[2]=new int[3];
		arr[3]=new int[4];
		arr[4]=new int[5];
		
		//1씩 증가된 값을 대입하여 출력
		
		int cnt=1;
	
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=cnt++; //1부터 1씩 증가된 값을 대입
				System.out.print(arr[i][j]+"\t"); //출력			
			}
			System.out.println();
		}
		
	}
	
}
