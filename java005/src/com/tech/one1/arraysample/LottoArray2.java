package com.tech.one1.arraysample;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class LottoArray2 {
	public static void main(String[] args) {
		// 1~45까지의 숫자 중 6개의 숫자
		// 로또 번호 추출
		int[] arr = new int[6];
		Random r = new Random();

		// 중복회피!
		for (int i = 0; i < arr.length; i++) {
			int rNum = r.nextInt(45) + 1;
			arr[i] = rNum;
			
			System.out.println("arr : "+i+">>"+arr[i]); //중복됐던 데이터 확인	
			// 중복검사
			for (int j = 0; j < i; j++) {
				if (arr[j] == rNum) { //중복값이 있다면 안쪽 for문 빠져나와서 바깥for문으로 으로 다시 나감
					i--; //1씩 감소
					break;
				} // if end
				
			} // 안쪽 for end
		} // for end
		
		// 출력 정렬전
		System.out.println(Arrays.toString(arr));
		//배열의 오름차순 정렬
		Arrays.sort(arr); //오름차순 정렬(1,2,3...a,b,c 이순)<->내림차순
		System.out.println(Arrays.toString(arr));
		
		//역정렬
//		Arrays.sort(arr, Collections.reverseOrder()); lotto Array3 보셈
		
	}

}
