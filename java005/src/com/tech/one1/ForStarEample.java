package com.tech.one1;

public class ForStarEample {
	public static void main(String[] args) {
		// �����
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// ���ﰢ������ �����

//		for(int i=0; i<5; i++) {
//			int k=0;
//			for(int j=0; j<5; j++) {
//				k += j-1;
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// ����
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}// main end

}// class end
