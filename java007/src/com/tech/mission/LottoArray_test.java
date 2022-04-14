package com.tech.mission;

import java.util.Arrays;
import java.util.Random;

public class LottoArray_test {
	public static void main(String[] args) {

		Integer arr[] = new Integer[6];
		Random r = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(45) + 1;

			for (int j = 0; j < i; j++) {
				if (arr[j] == arr[i]) {
					i--;
					break;
				}
			} // ¾ÈÂÊ for end

//			System.out.println(arr[i]);

		} // for end

		System.out.println("Lotto : \n" + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Lotto : \n" + Arrays.toString(arr));

	}

}
