package com.tech.two1;

enum Season { // 열거형 선언(enum -> 열거형 타입)
	봄, 여름, 가을, 겨울, 겨울2
}

public class EnumExample {

	public static void main(String[] args) {
		
//		System.out.println();
//		for (int i = 0; i < args.length; i++) {
//			
//		}
		
		for (Season sea : Season.values()) {//foreach문, values의 
			System.out.println(sea);
			
		}

	}

}
