package com.tech.two2.methodtest;

public class MethodTest2 {
//	void : return ���� ���� (��ȯ�޴� ���� ����)
	
	//sum�� ����� ���� �Լ� makeSum
	public void makeSum() {
		
		int start=0;
		int end=100;
		int sum=0;
		
		for (int i=start; i<=end; i++) {
			sum += i;
		}
		System.out.println("sum = "+sum);
	} //makeSum end
	
	public static void main(String[] args) {

		MethodTest2 m2 = new MethodTest2(); // ��ü����
		m2.makeSum();//makesum �Լ� ȣ��
		m2.makeSum();//makesum �Լ� ȣ��
		m2.makeSum();//makesum �Լ� ȣ��


	} // main end

} // class end
