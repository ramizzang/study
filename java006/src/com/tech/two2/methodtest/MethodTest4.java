package com.tech.two2.methodtest;

public class MethodTest4 {
	//	void : return ���� ����,Ÿ���� ���� (��ȯ�޴� ���� ����)
	// �Լ��� ����ϴ� ���� : ������ �ڵ尡 ������ ���� �� ȣ�⸸ �ؼ� ����� �� �ֵ��� (�ڵ���������)

	// sum�� ����� ���� �Լ� makeSum
	// makeSum(Ÿ�Ը� ����, Ÿ�Ը� ����)-> ȣ��� ������ �� ������ �Ŀ� �����Ͽ� �������
	public int makeSum(int start, int end) { // return ���� �������� void ���� ��ȯ���� Ÿ�� ������

		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum += i;
		}
		return sum;
	} // makeSum end

	public static void main(String[] args) {

		MethodTest4 m2 = new MethodTest4(); // ��ü����
		int sum = m2.makeSum(1, 100);// return�� ���⼭ �޾Ƽ� ���
		int sum2 = m2.makeSum(8, 80);

		System.out.println("sum = " + sum);
		System.out.println("sum2 = " + sum2);

	} // main end

} // class end
