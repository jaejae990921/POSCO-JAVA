package java_generic;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		int[] nums1 = { 2, 5, 8, 3, 7 };
		System.out.println(sumLessThan(nums1, 5));
	}

	public static int sumLessThan(int[] arr, int num) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < num) {
				sum += arr[i];
			}
		}
		return sum;
	}
}
