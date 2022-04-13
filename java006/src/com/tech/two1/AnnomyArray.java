package com.tech.two1;

import java.util.Arrays;

public class AnnomyArray {
	
	public static void main(String[] args) {
		//무명배열(배열의 이름이 없는 배열)
		
		int[] aa= {1,2,3,4,5};
		System.out.println(Arrays.toString(aa));
		
		//무명 배열의 사용
		//사용되는 곳이 한차례, 사용되고 끝
		System.out.println(Arrays.toString(new int[] {5,6,7,8,9}));
		
		
	}

}
