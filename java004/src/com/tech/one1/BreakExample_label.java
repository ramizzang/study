package com.tech.one1;

public class BreakExample_label {

	public static void main(String[] args) {
		
		//label�� ����ؼ� �ݺ���� ����������
		//
		gotolabel:
		for(int i=0; i<=3; i++) {
			System.out.println("i ==== "+i);
			for(int j=0; j<10; j++) {
				if(j==5) {
					break gotolabel; 
				}
				System.out.println("j = "+j);
			}
		} //for�� end

	} //main end

} //class end
