package com.tech.one1;

public class BreakExample {

	public static void main(String[] args) {
		
		for(int i =1; i<=10; i++) {
			if(i==5) {
				break;
			}//if end
			System.out.println(i);
		}//for end
		
		System.out.println("===================");
		
		for(int i=0; i<=3; i++) {
			System.out.println("i ==== "+i);
			for(int j=0; j<10; j++) {
				if(j==5) {
					break; //j�� 5�϶� ��ø for ���� ��������
				}
				System.out.println("j = "+j);
			}
		}

	} //main end

} //class end
