package com.tech.one2;

import java.util.Arrays;
import java.util.Random;

public class DiceCount2 {
	public static void main(String[] args) {
		//배열을 사용해서 주사위 10000번을 던져 각각 면의 횟수를 추출
		Random r=new Random();
		int[] arr=new int[6]; //주사위 면 6개~
		
		
		//주사위 10000번 던져서 값 얻기
		
		int num;
		
		for (int i=0; i<10000; i++) {
			num=r.nextInt(6)+1;
			//arr의 index 숫자와 num과의 공통점 (1차이)
			arr[num-1]++; //1차니까 인덱스 넘 -1 이 나올때 인덱스 넘버에 1씩 증가하게 해주는거!!!!

		}
		
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i+1)+"면 - "+arr[i]);
			
		}
		
	}
	

}
