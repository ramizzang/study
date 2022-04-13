package com.tech.one2;

import java.util.Arrays;
import java.util.Random;

public class DiceCount {
	public static void main(String[] args) {
		//배열을 사용해서 주사위 10000번을 던져 각각 면의 횟수를 추출
		Random r=new Random();
		int[] arr=new int[6]; //주사위 면 6개~
		
		
		//주사위 10000번 던져서 값 얻기
		
		int num;
		
		for (int i=0; i<10000; i++) {
			num=r.nextInt(6)+1;
			if(num==1)
//				arr[0]=arr[0]+1;
				arr[0]++;
			else if(num==2) arr[1]++; //num 이 2가 나왔을 때 경우를 한번 카운트 하는거라 arr[]에 +1씩 누적
			else if(num==3) arr[2]++;
			else if(num==4) arr[3]++;
			else if(num==5) arr[4]++;
			else if(num==6) arr[5]++;
			
//			System.out.println(i+":"+num);
		}
		
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i+1)+"면 - "+arr[i]);
		}
		
	}
	

}
