package com.tech.one2.scan;

import java.util.Random;
import java.util.Scanner;

public class ExampleScan2 {
	public static void main(String[] args) {
		//�ֻ����� ������(com), ���� �Է��ϴ� ���ڿ� ���ϰ� ���� �Ǵ�.
		Scanner s=new Scanner(System.in);
		Random ran=new Random();
				
		System.out.println("***�ֻ��� ����***");
		System.out.println("���� �ֻ��� ����>");
//		String userStr=s.nextLine();
//		int userNum=Integer.parseInt(userStr); //ȭ�鿡�� ���� ���ڿ��� int������ ��ȯ
		//���� �� ������ �ϳ��� ��ġ��
		int userNum=s.nextInt();
		
		
		
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
