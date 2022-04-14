package com.tech.two1;

public class Car {
	// 생성자 : 생성자명은 클래스명과 같다. 리턴타입이 없어야한다.

	String color = "noncolor";
	String model;

	// 기본생성자 - 단독사용시 생략가능(하지만 사용자생성자가 있다면 기본생성자 생략불가)
	public Car() { // 파라미터값이 없는 것
		System.out.println("기본생성자 호출");

	}

	// 사용자생성자
	// 생성자를 두 개 이상 구현하는 경우를 생성자 오버로딩이라고
	public Car(int num) { // 파라미터값이 있는 것
		System.out.println();

	}

	public Car(int num1, int num2) { // 파라미터값이 있는 것
		System.out.println();

	}

	public Car(int num1, int num2, float num3) { // 파라미터값이 있는 것
		System.out.println();

	}

	// this
	public Car(String color, String model) {
		this.color = color; // this.color -> this는 자기자신의 클래스 의미
		this.model = model;

	}

	// 메서드
	private void getSum() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		Car car = new Car(); // 기본생성자 호출
		Car car2 = new Car(100); // 사용자생성자 호출
		Car car3 = new Car(100, 200);
		Car car4 = new Car(100, 200, 30f);
		Car car5 = new Car("파랑", "소나타");
	}

}
