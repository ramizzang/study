package com.tech.one2;

import java.util.Arrays;
import java.util.Random;

public class DiceCount {
	public static void main(String[] args) {
		//�迭�� ����ؼ� �ֻ��� 10000���� ���� ���� ���� Ƚ���� ����
		Random r=new Random();
		int[] arr=new int[6]; //�ֻ��� �� 6��~
		
		
		//�ֻ��� 10000�� ������ �� ���
		
		int num;
		
		for (int i=0; i<10000; i++) {
			num=r.nextInt(6)+1;
			if(num==1)
//				arr[0]=arr[0]+1;
				arr[0]++;
			else if(num==2) arr[1]++; //num �� 2�� ������ �� ��츦 �ѹ� ī��Ʈ �ϴ°Ŷ� arr[]�� +1�� ����
			else if(num==3) arr[2]++;
			else if(num==4) arr[3]++;
			else if(num==5) arr[4]++;
			else if(num==6) arr[5]++;
			
//			System.out.println(i+":"+num);
		}
		
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i+1)+"�� - "+arr[i]);
		}
		
	}
	

}
