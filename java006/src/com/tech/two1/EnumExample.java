package com.tech.two1;

enum Season { // ������ ����(enum -> ������ Ÿ��)
	��, ����, ����, �ܿ�, �ܿ�2
}

public class EnumExample {

	public static void main(String[] args) {
		
//		System.out.println();
//		for (int i = 0; i < args.length; i++) {
//			
//		}
		
		for (Season sea : Season.values()) {//foreach��, values�� 
			System.out.println(sea);
			
		}

	}

}
