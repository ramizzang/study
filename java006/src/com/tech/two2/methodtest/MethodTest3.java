package com.tech.two2.methodtest;

public class MethodTest3 {
//	void : return ���� ���� (��ȯ�޴� ���� ����)

	// sum�� ����� ���� �Լ� makeSum
	// makeSum(Ÿ�Ը� ����, Ÿ�Ը� ����)-> ȣ��� ������ �� ������ �Ŀ� �����Ͽ� �������

	public void makeSum(int start, int end) { //�Ķ���Ͱ��� �Է� �޾� ���

		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum += i;
		}
		System.out.println("sum = " + sum);
	} // makeSum end

	public static void main(String[] args) {

		MethodTest3 m2 = new MethodTest3(); // ��ü����
		m2.makeSum(1, 100);// makesum �Լ� ȣ��
		m2.makeSum(2, 50);
		m2.makeSum(5, 20);
		m2.makeSum(1, 80);

	} // main end

} // class end
