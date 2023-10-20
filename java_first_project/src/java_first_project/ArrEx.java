package java_first_project;
import java.util.Arrays;
import java.util.Scanner;

public class ArrEx {

	public static void main(String[] args) {
		// 배열 출력 기초
//		int[] intArr = { 1, 2, 3, 4, 5 };
//		
//		for (int i = 0; i < intArr.length; i++) {
//			System.out.print(intArr[i] + " ");
//		}

		Scanner sc = new Scanner(System.in);
		int[] intArr = new int[5]; // 크기가 5인 int 배열 선언

		System.out.println("숫자 5개를 입력하세요");

		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = sc.nextInt();
		}

		// Arrays.toString : 배열의 요소를 문자열로 반환
		System.out.println(Arrays.toString(intArr));
		sc.close();
	}
}
