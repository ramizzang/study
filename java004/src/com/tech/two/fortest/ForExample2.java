package com.tech.two.fortest;

public class ForExample2 {

	public static void main(String[] args) {
		
		//¦���� �� ����
		
		int sum=0;
		for(int i=0; i<=100; i++) {
			if(i%2==0) // 2�� ����϶� (¦���϶�,2�γ��� �������� 0�϶�)
				sum += i;
		}
		
		System.out.println(sum);
		
	}//main end

}//class end
