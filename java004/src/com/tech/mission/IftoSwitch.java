package com.tech.mission;

public class IftoSwitch {
	public static void main(String[] args) {
		int score = (int) (Math.random() * 150) + 50;
		System.out.println(score);
		if (score <= 100) {
			switch (score / 10) {
			case 10:
				System.out.println("A등급");
			case 9:
				System.out.println("A등급");
				break;
			case 8:
				System.out.println("B등급");
				break;
			case 7:
				System.out.println("C등급");
				break;
			case 6:
				System.out.println("D등급");
				break;
			default:
				System.out.println("F등급");
			}
		} else {
			System.out.println("점수입력 에러");
		}
	}
}