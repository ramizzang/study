package com.tech.one1;

import java.util.Arrays;

public class TwoDemenArray4 {
	public static void main(String[] args) {
		//������ �迭
		//�ұ�Ģ�� �迭�� ���� ����
		//�տ� row�� ���̸� �����ָ� ������ �ȴ�
		int[][] arr=new int[5][];
		//������ colrow�� ���̸� ����
		arr[0]=new int[1]; //int[][] arr new int[0][1];
		arr[1]=new int[2];
		arr[2]=new int[3];
		arr[3]=new int[4];
		arr[4]=new int[5];
		
		//1�� ������ ���� �����Ͽ� ���
		
		int cnt=1;
	
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=cnt++; //1���� 1�� ������ ���� ����
				System.out.print(arr[i][j]+"\t"); //���			
			}
			System.out.println();
		}
		
	}
	
}
