package com.tech.one1;

import java.util.Arrays;

public class TwoDemenArray3 {
	public static void main(String[] args) {
		//������ �迭�� �ʱ�ȭ
		//for�� �̿�		
		//5,4 ���� �迭�� ����� 1���� 1�� ������ ���� �迭�� �����ϰ� ������
		
		int[][] arr=new int[5][4];
		int cnt=1;
		
		//�迭�� �Է�
		for (int i = 0; i < arr.length; i++) {			
			for (int j = 0; j < arr[i].length; j++) {
//				arr[i][j]=cnt;
//				cnt=cnt+1;				
				arr[i][j]=cnt++; //cnt ���� for�� �����ϸ鼭 1�� ������ ���� ����		
			}

		}
							
		//��¹�
		for (int i = 0; i < arr.length; i++) {			
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t"); //��¹�
			}
			System.out.println();
		}
				
	}
}
