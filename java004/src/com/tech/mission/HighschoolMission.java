package com.tech.mission;

public class HighschoolMission {

	public static void main(String[] args) {

//      HighSchoolMission.java

//      Math.random�� Ȱ���Ͽ� 1~5���� �Է¹޾�

//      1�̸� 1�ݼҼ��Դϴ�

//      2�̸� 2�ݼҼ��Դϴ�

//      3�̸� 3�ݼҼ��Դϴ�

//      4�̸� 4�ݼҼ��Դϴ�

//      5�̸� 5�ݼҼ��Դϴ�

//      if������ �б�

//      

//      ���� : 0331_if_�ּ���

//      ����12�ñ���

		int num = (int) (Math.random() * 5) + 1;

		System.out.print(num);

		String class1 = "";

		if (num == 1) {

			System.out.println(class1 + "�̸� 1�� �Ҽ��Դϴ�.");

		}

		else if (num == 2) {

			System.out.println(class1 + "�̸� 1�ݼҼ��Դϴ�.");

		}

		else if (num == 3) {

			System.out.println(class1 + "�̸� 3�ݼҼ��Դϴ�.");

		}

		else if (num == 4) {

			System.out.println(class1 + "�̸� 4�ݼҼ��Դϴ�.");

		}

		else if (num == 5) {

			System.out.println(class1 + "�̸� 5�ݼҼ��Դϴ�.");

		} else {

			System.out.println("Error");

		}

	}

}