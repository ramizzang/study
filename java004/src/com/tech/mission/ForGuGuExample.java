package com.tech.mission;

public class ForGuGuExample {

	public static void main(String[] args) {
		
		//for������ 5��ǥ��
		for(int i=1;i<=9;i++) {
			System.out.printf("%d * %d = %d\n", 5,i,5*i);
		}
		System.out.println();
				
		
//		//for������ ������ �����
//		for(int i=2;i<=9;i++) {
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d * %d = %d\n",i,j,i*j);
//			}
//			System.out.println();
//			
//		}
		
		//for������ ������ �����_�̰ſ��� 5�ܸ� ������ �;�
		for(int i=2;i<=9;i++) {
			if(i==5) {
				for(int j=1;j<=9;j++) {
				System.out.printf("%d * %d = %d\n",i,j,i*j);
				}//��øfor end
			System.out.println();
			} else continue;
			
		}//for end

	}//class end

}//main end
