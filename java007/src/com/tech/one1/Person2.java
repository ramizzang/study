package com.tech.one1;

public class Person2 {
	
	//����(�Ӽ�)
	String name; //Ŭ���� �������� ��� �� �� ����_��������
	int age;
	boolean b;
	
	public static void main(String[] args) {
//		String name;  //main �ȿ��� ����Ǹ� ���������� main�ȿ����� ��� ����
		
		Person2 p2= new Person2();
		p2.call();
				
	}
	
	private void call() {
		
		System.out.println("���̴�"+age);
		System.out.println("bool : "+b);
		System.out.println("name : "+name);
		
//		���� name�� age ������ call�ȿ��� �Ѵٸ�
//		String name; //���������� ����� --> �׷��� call �ȿ����� ��� �� �� ����, main���� ȣ�������� ������
//		int age;

	}
	
	//�޼���(���)
	private void eat() {

	}
	private void sleep() {

	}
	private void laugh() {

	}
	private void walk() {

	}

}
