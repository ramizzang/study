package com.tech.one2.scan;

import java.util.Random;
import java.util.Scanner;

public class ExampleScan {
	public static void main(String[] args) {
		//�ֻ����� ������(com), ���� �Է��ϴ� ���ڿ� ���ϰ� ���� �Ǵ�.
		Scanner s=new Scanner(System.in);
		Random ran=new Random();
		
//		System.out.println(ran.nextInt(10)); //0~9
//		System.out.println(ran.nextDouble()*10); //Math.random�̶� ����
		
		System.out.println("***�ֻ��� ����***");
		System.out.println("���� �ֻ��� ����!");
		int userNum=ran.nextInt(6)+1;
		System.out.println("userNum : "+ userNum);
		
		System.out.println("com �ֻ��� ����!");
		int comNum=ran.nextInt(6)+1;
		System.out.println("comNum : " +comNum);
		
		//����
		System.out.println("============================");
		
		if(userNum==comNum) {
			System.out.printf("user=%d : com=%d, ���º��Դϴ�.%n",userNum,comNum);
		}else if(userNum>comNum){
			System.out.printf("user=%d : com=%d, user �¸��Դϴ�.%n",userNum,comNum);
		}else{
			System.out.printf("user=%d : com=%d, com �¸��Դϴ�.%n",userNum,comNum);
		}
				
	}

}
