package com.tech.one1;

public class ContinueExample {

	public static void main(String[] args) {
		//continue��
		//���ǽ��� ���� ��Ȳ�� �ǳʶٰ� ���� ���� ����
		
		for(int i=0;i<10;i++) {
			if(i==5) {
				continue; //i�� 5�� �� �ǳʶٰ� ���� ���� ����
			}
			System.out.println("i="+i);
		}
	}

}
