package com.tech.one1;

public class WhileExample2 {
	public static void main(String[] args) {
				
		int i=1;
		int sum=0; //sum �ʱ�ȭ
		
		while(i<=10) {			
//			int sum=0; // sum�� while�� �ȿ��� �ʱ�ȭ �ȴٸ� while���� ����Ǵµ��� ��� �ʱ�ȭ �Ǽ� i���� ���� ���� ����.
			
			sum += i; //sum -> 1�� ������ ���� ����
			i++;
			
		}//while1 end
		
		System.out.println("sum = "+sum);
		
		int j=0;
		
		while(j<=10) {
			//while���� ����Ǵ� ���� ��� �ʱ�ȭ �Ǽ� sum�� j�� �������� ����.
			int sum2=0;
			
			sum2 +=j;
			j++;
			
			System.out.printf("sum2=%d, j=%d%n", sum2,j);
		}//while2 end
		
	}//main end

}//class end
