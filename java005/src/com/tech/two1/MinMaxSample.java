package com.tech.two1;

public class MinMaxSample {
	public static void main(String[] args) {
		// �迭���� �ּҰ� �ִ밪 ���ϱ�
//		int min = 100; // ������ �ִ밪�� �ּҰ����� ����ְ�
//		int max = 0;
		int[] arr = { 50, 40, 70, 20, 30 }; // ����������� ����
		int min = arr[0]; // �ᱹ �������̶� ��� ���ϸ鼭 ġȯ�Ǵ°�!! �׷��� index0���� �����!
		int max = arr[0];

		// �ּҰ� �˻�
		for (int i = 0; i < arr.length; i++) {
			// ��� min,max ���� ���ϸ鼭 ���� �������ִ� ��!!!!
			if (min > arr[i]) // ���� min>arr[i] �̸� min ���� arr[i] ������ ����! -> for�� ����Ǹ鼭 ���� ���� ���� �ᱹ min���� ����!
				min = arr[i];
			if (max < arr[i]) // else if ���� �ȵ�� ���� ���Ƽ� �̷��� �غ�!
				max = arr[i]; // max<arr[i] �̸� max ���� arr[i] ������ ����
			System.out.println("min=" + min + " max=" + max);
		}
		System.out.println("min : " + min + " max : " + max);
	}

}
