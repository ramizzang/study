package com.tech.two1;

public class Car {
	// ������ : �����ڸ��� Ŭ������� ����. ����Ÿ���� ������Ѵ�.

	String color = "noncolor";
	String model;

	// �⺻������ - �ܵ����� ��������(������ ����ڻ����ڰ� �ִٸ� �⺻������ �����Ұ�)
	public Car() { // �Ķ���Ͱ��� ���� ��
		System.out.println("�⺻������ ȣ��");

	}

	// ����ڻ�����
	// �����ڸ� �� �� �̻� �����ϴ� ��츦 ������ �����ε��̶��
	public Car(int num) { // �Ķ���Ͱ��� �ִ� ��
		System.out.println();

	}

	public Car(int num1, int num2) { // �Ķ���Ͱ��� �ִ� ��
		System.out.println();

	}

	public Car(int num1, int num2, float num3) { // �Ķ���Ͱ��� �ִ� ��
		System.out.println();

	}

	// this
	public Car(String color, String model) {
		this.color = color; // this.color -> this�� �ڱ��ڽ��� Ŭ���� �ǹ�
		this.model = model;

	}

	// �޼���
	private void getSum() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		Car car = new Car(); // �⺻������ ȣ��
		Car car2 = new Car(100); // ����ڻ����� ȣ��
		Car car3 = new Car(100, 200);
		Car car4 = new Car(100, 200, 30f);
		Car car5 = new Car("�Ķ�", "�ҳ�Ÿ");
	}

}
