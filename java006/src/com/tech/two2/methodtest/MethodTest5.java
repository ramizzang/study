package com.tech.two2.methodtest;

public class MethodTest5 {

	public int makeSum(int pay1, int pay2) { 

		int paysum=0;
		paysum = pay1+pay2;
		return paysum;
		
	} // makeSum end

	public static void main(String[] args) {
		
		MethodTest5 m2 = new MethodTest5(); // ��ü����
		int sum1=m2.makeSum(1000000, 2000000); //makeSum�Լ� ȣ��
		
		//���� ���� ���� �Ǵ��� ��������
		if(sum1>=300000) {
			System.out.println("�׷�");
		}else {
			System.out.println("�����غ���");
		}

	} // main end

} // class end
