package com.tech.two1;

import java.util.Scanner;

public class SerchExample {
	public static void main(String[] args) {
		//�迭���� ã�� ���� ��ġ�� �˾Ƴ���
		//�������迭
		int[] arr= {0,10,20,30,40,50,60,70,80,90,100};
		
//		int value; // ���� ���൵ ���� �ȳ��� ������ �Ʒ� ��ĳ�ʸ� ���� �ʱ�ȭ ���ֱ� ����!
//		int index=-1;
		int value,index=-1; // ���� ���� ���ٷ� 
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Ž������ �Է��ϼ���.");
		value=scan.nextInt(); //��ĳ�ʸ� ���� ���� ���� int�� ����
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==value) {
				index=i;
			}
		}
		System.out.println(value+"����"+(index+1)+"��° ��ġ�մϴ�."); //�ε����ѹ� 0���� �����̶� +1 ����
		
	}

}
