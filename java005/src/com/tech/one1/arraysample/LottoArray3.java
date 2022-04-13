package com.tech.one1.arraysample;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class LottoArray3 {
	public static void main(String[] args) {
		// 1~45������ ���� �� 6���� ����
		// �ζ� ��ȣ ����
		Integer[] arr = new Integer[6]; //������ ���ֱ� ���� Ÿ���� Integer�� �ٲ���
		Random r = new Random();

		// �ߺ�ȸ��!
		for (int i = 0; i < arr.length; i++) {
			int rNum = r.nextInt(45) + 1;
			arr[i] = rNum;
			
			System.out.println("arr : "+i+">>"+arr[i]); 
			// �ߺ��˻�
			for (int j = 0; j < i; j++) {
				if (arr[j] == rNum) { //�ߺ����� �ִٸ� ���� for�� �������ͼ� �ٱ�for������ ���� �ٽ� ����
					i--; //1�� ����
					break;
				} // if end
				
			} // ���� for end
		} // for end
		
		// ��� ������
		System.out.println(Arrays.toString(arr));
		//�迭�� �������� ����
		Arrays.sort(arr); //�������� ����(1,2,3...a,b,c �̼�)<->��������
		System.out.println(Arrays.toString(arr));
		
		//������
		Arrays.sort(arr, Collections.reverseOrder()); 
		//Collections.reverseOrder()�� ����Ϸ��� IntegerŸ������ ��ȯ�޾ƾ� ��� �����ϴ�
		
	}

}
