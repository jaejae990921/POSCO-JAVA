package java_first_project;
import java.util.Arrays;

public class ArraysMethods {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		// copyOf: 특정 길이 만큼 복사한 새로운 배열 반환
		int[] newArr = Arrays.copyOf(arr, 4); // 4개 copy
		System.out.println(Arrays.toString(newArr)); // [1, 2, 3, 4]

		// copyOfRage: 시작 인덱스부터 종료 인덱스 전까지의 부분을 복사한 새로운 배열 반환
		// 시작 인덱스부터 n개 복사한다고 이해해도 될듯 -> (arr, 0, 3)은 0부터 3개 복사 즉, 0 1 2 이므로 똑같음
		int[] newArr2 = Arrays.copyOfRange(arr, 0, 3); // arr배열 인덱스 0부터 3 이전까지 요소 복사
		System.out.println(Arrays.toString(newArr2)); // [1, 2, 3]

		// fill: 배열의 모든 요소를 주어진 값으로 채움
		Arrays.fill(arr, 10);
		System.out.println(Arrays.toString(arr)); // [10, 10, 10, 10, 10]

		int[] arr2 = new int[5];
		arr2[0] = 1;
		arr2[1] = 2;
		arr2[2] = 3;
		Arrays.fill(arr2, 3, arr2.length, 100);
		// 인덱스 3부터 끝까지는 100으로 채운다. 나머지 요소는 원래 있던 그대로
		System.out.println(Arrays.toString(arr2)); // [1, 2, 3, 100, 100]

		// sort: 배열을 오름차순으로 정렬
		int[] arr3 = { 3, 2, 4, 5, 1 };
		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));

		// 배열 뒤집기
		int[] reArr = new int[5];

		for (int i = arr3.length - 1, j = 0; i >= 0; i--, j++) {
			reArr[j] = arr3[i];
		}
		System.out.println(Arrays.toString(reArr));

		// equals: 두 배열의 요소가 같은지 확인
		int[] arr4 = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.equals(arr3, arr4));

		// deepEquals: 다차원 배열 비교
		int[][] arrs1 = { { 1, 2 }, { 3, 4 } };
		int[][] arrs2 = { { 1, 2 }, { 3, 4 } };
		System.out.println(Arrays.deepEquals(arrs1, arrs2));

		// binarySearch: 배열의 특정 요소의 인덱스를 반환
		int index = Arrays.binarySearch(arr3, 2); // {1, 2, 3, 4, 5}
		System.out.println(index); // 2
	}
}
