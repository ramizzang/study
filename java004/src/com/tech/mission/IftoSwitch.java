package com.tech.mission;

public class IftoSwitch {
	public static void main(String[] args) {
		int score = (int) (Math.random() * 150) + 50;
		System.out.println(score);
		if (score <= 100) {
			switch (score / 10) {
			case 10:
				System.out.println("A���");
			case 9:
				System.out.println("A���");
				break;
			case 8:
				System.out.println("B���");
				break;
			case 7:
				System.out.println("C���");
				break;
			case 6:
				System.out.println("D���");
				break;
			default:
				System.out.println("F���");
			}
		} else {
			System.out.println("�����Է� ����");
		}
	}
}