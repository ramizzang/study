package com.tech.mission;

import java.util.*;

public class ForGuGuExample2 {

	public static void main(String[] args) {		
		//missio1_���ڸ� �Է¹޾Ƽ� �Է¹��� ���� ���
		
		//ȭ������ �Է¹ޱ�
		System.out.println("����ϰ� ���� ���� �Է��ϼ���~!(������ �Է�)>");
		Scanner scan1=new Scanner(System.in);
		
		//�Է¹��� ���ڿ��� int�� ������ �����ϱ�
		int num1=scan1.nextInt();
		
		System.out.printf("%d���� ����մϴ�.%n",num1);
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", num1,i,i*num1);	
		}
			
	}//main end

}//class end
