package com.tech.mission;

public class TwoDemenArray_test {
	public static void main(String[] args) {

		int[][] arr = new int[4][3];

		int cnt = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = cnt += 10; // °ª ÀÔ·Â
				if (cnt >= 90) 
					cnt = 0;
				
				System.out.print(arr[i][j] + ",");
			}
			System.out.println();
		}

	}// class end

}// main end
