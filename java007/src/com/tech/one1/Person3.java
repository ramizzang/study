package com.tech.one1;

public class Person3 {

	// ����(�Ӽ�)
	String name; // �������� �⺻�� �� null
	int age;
	boolean b;

	public static void main(String[] args) {
		
		//��ü�� ���� : Ŭ������ ���������� = new Ŭ������();
		Person3 p3 = new Person3(); //Ŭ������ ���������� = new Ŭ������(); (p3 -> ��������)
		
		//��ü�� ���
		p3.name="ȫ�浿";
		p3.laugh();

	}

	private void call() {

	}

	// �޼���(���)
	private void eat() {

	}

	private void sleep() {

	}

	private void laugh() {
		System.out.println(name+"�� Ȱ¦ ����");
	}

	private void walk() {

	}

}
