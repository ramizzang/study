package com.tech.one2;

import java.util.Arrays;
import java.util.Random;

public class DiceCount2 {
	public static void main(String[] args) {
		//�迭�� ����ؼ� �ֻ��� 10000���� ���� ���� ���� Ƚ���� ����
		Random r=new Random();
		int[] arr=new int[6]; //�ֻ��� �� 6��~
		
		
		//�ֻ��� 10000�� ������ �� ���
		
		int num;
		
		for (int i=0; i<10000; i++) {
			num=r.nextInt(6)+1;
			//arr�� index ���ڿ� num���� ������ (1����)
			arr[num-1]++; //1���ϱ� �ε��� �� -1 �� ���ö� �ε��� �ѹ��� 1�� �����ϰ� ���ִ°�!!!!

		}
		
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i+1)+"�� - "+arr[i]);
			
		}
		
	}
	

}
