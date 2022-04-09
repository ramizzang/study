package com.tech.mission;

public class HighschoolMission {

	public static void main(String[] args) {

//      HighSchoolMission.java

//      Math.random을 활용하여 1~5까지 입력받아

//      1이면 1반소속입니다

//      2이면 2반소속입니다

//      3이면 3반소속입니다

//      4이면 4반소속입니다

//      5이면 5반소속입니다

//      if문으로 분기

//      

//      제목 : 0331_if_최성훈

//      오늘12시까지

		int num = (int) (Math.random() * 5) + 1;

		System.out.print(num);

		String class1 = "";

		if (num == 1) {

			System.out.println(class1 + "이면 1반 소속입니다.");

		}

		else if (num == 2) {

			System.out.println(class1 + "이면 1반소속입니다.");

		}

		else if (num == 3) {

			System.out.println(class1 + "이면 3반소속입니다.");

		}

		else if (num == 4) {

			System.out.println(class1 + "이면 4반소속입니다.");

		}

		else if (num == 5) {

			System.out.println(class1 + "이면 5반소속입니다.");

		} else {

			System.out.println("Error");

		}

	}

}