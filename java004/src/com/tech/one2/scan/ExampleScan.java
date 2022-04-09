package com.tech.one2.scan;

import java.util.Random;
import java.util.Scanner;

public class ExampleScan {
	public static void main(String[] args) {
		//주사위를 굴려서(com), 내가 입력하는 숫자와 비교하고 승패 판단.
		Scanner s=new Scanner(System.in);
		Random ran=new Random();
		
//		System.out.println(ran.nextInt(10)); //0~9
//		System.out.println(ran.nextDouble()*10); //Math.random이랑 같음
		
		System.out.println("***주사위 놀이***");
		System.out.println("영구 주사위 굴려!");
		int userNum=ran.nextInt(6)+1;
		System.out.println("userNum : "+ userNum);
		
		System.out.println("com 주사위 굴려!");
		int comNum=ran.nextInt(6)+1;
		System.out.println("comNum : " +comNum);
		
		//판정
		System.out.println("============================");
		
		if(userNum==comNum) {
			System.out.printf("user=%d : com=%d, 무승부입니다.%n",userNum,comNum);
		}else if(userNum>comNum){
			System.out.printf("user=%d : com=%d, user 승리입니다.%n",userNum,comNum);
		}else{
			System.out.printf("user=%d : com=%d, com 승리입니다.%n",userNum,comNum);
		}
				
	}

}
