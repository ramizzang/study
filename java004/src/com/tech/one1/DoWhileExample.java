package com.tech.one1;

public class DoWhileExample {
	public static void main(String[] args) {
		
		int i=1;
		int sum=0;
		while(i<=10) {
			sum += i;
			i++;
		}
		System.out.println("sum = "+sum);
		
		//Do while��_��� �ѹ��� ���� �� ���� �Ǵ�
		int j=1;
		do {
			System.out.println("j="+j);
			j++;
		} while (j<1);
		
		//while�� : ������ �� �� �ݺ� (������ �� ���� �� �� ���� ����)
		//do while�� : ��� 1ȸ ���� �� ������ �� �ݺ�(1ȸ�� ������ ����)
		
	}//main end

}//class end
