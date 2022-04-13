package com.tech.one1;

public class Person2 {
	
	//변수(속성)
	String name; //클래스 전역에서 사용 할 수 있음_전역변수
	int age;
	boolean b;
	
	public static void main(String[] args) {
//		String name;  //main 안에서 선언되면 지역변수로 main안에서만 사용 가능
		
		Person2 p2= new Person2();
		p2.call();
				
	}
	
	private void call() {
		
		System.out.println("나이는"+age);
		System.out.println("bool : "+b);
		System.out.println("name : "+name);
		
//		만약 name과 age 선언을 call안에서 한다면
//		String name; //지역변수로 선언됨 --> 그래서 call 안에서만 사용 할 수 있음, main에서 호출했을때 에러남
//		int age;

	}
	
	//메서드(기능)
	private void eat() {

	}
	private void sleep() {

	}
	private void laugh() {

	}
	private void walk() {

	}

}
