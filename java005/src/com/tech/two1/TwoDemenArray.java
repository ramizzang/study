package com.tech.two1;

import java.util.Arrays;

public class TwoDemenArray {
	public static void main(String[] args) {
		// 이차원 배열
		// 선언
		int[][] arr = new int[4][3]; // 행렬 타입[][] 배열명=new 타입[n행][n렬] 이라고 생각! 행:row, 렬:colrow

		// 선언과 초기화 동시에
		int[][] array = { // 좌표값처럼 생각하면
				{ 10, 11 }, // (0,0/0,1)
				{ 20, 21, 22 }, // (1,0/1,1/1,2)
				{ 30 }, // (2,0)
				{ 40, 41, 42 } // (3,0/3,1/3,2)
		};
		System.out.println(array[1][2]);
		// 모두출력
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(array.length); // 이차원 배열에서 행의 길이
		System.out.println(array[0].length); // 이차원 배열에서 행이 가진 열의 개수
		
	}

}
