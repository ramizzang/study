package com.tech.one1;

public class TwoDemenArray2 {
	public static void main(String[] args) {
		//������ �迭�� �ʱ�ȭ
		//for�� �̿�		
		//5,4 ���� �迭�� ����� 1���� 1�� ������ ���� �迭�� �����ϰ� ������
		
		int[][] arr=new int[5][4];
		int cnt=0;
	
		//��¹�
		for (int i = 0; i < arr.length; i++) {			
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]); //��¹�
			}
			System.out.println();
		}
				
	}
}
