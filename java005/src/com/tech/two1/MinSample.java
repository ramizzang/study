package com.tech.two1;

public class MinSample {
	public static void main(String[] args) {
		// �迭���� �ּҰ� �ִ밪 ���ϱ�
		int min = 100; // ������ �ִ밪�� �ּҰ����� ����ְ�
		int[] arr = { 80, 40, 70, 20, 30 }; // ����������� ����

		// �ּҰ� �˻�
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) // ���� min>arr[i] �̸� min ���� arr[i] ������ ����! -> for�� ����Ǹ鼭 ���� ���� ���� �ᱹ min���� ����!
				min = arr[i];
			System.out.println("min=" + min);

		}
		System.out.println("min : " + min);
	}
}
