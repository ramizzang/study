package com.tech.one1;

public class Person3 {

	// 변수(속성)
	String name; // 참조형의 기본값 은 null
	int age;
	boolean b;

	public static void main(String[] args) {
		
		//객체의 생성 : 클래스명 참조변수명 = new 클래스명();
		Person3 p3 = new Person3(); //클래스명 참조변수명 = new 클래스명(); (p3 -> 참조변수)
		
		//객체의 사용
		p3.name="홍길동";
		p3.laugh();

	}

	private void call() {

	}

	// 메서드(기능)
	private void eat() {

	}

	private void sleep() {

	}

	private void laugh() {
		System.out.println(name+"이 활짝 웃다");
	}

	private void walk() {

	}

}
