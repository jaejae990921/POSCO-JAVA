package java_generic;

public class Test2 {

	public static void main(String[] args) {
		int[] nums2 = { 3, 2, 4, 7, 6, 8, 5 };
		int target2 = 9;
		int[] result2 = findIndices(nums2, target2);

		System.out.println("[" + result2[0] + ", " + result2[1] + "]");
	}

	public static int[] findIndices(int[] arr, int num) {
		int[] answer = new int[2];
		boolean flag = false;

		for (int i = 0; i < arr.length - 1; i++) {
			if (flag)
				break;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == num) {
					answer[0] = i;
					answer[1] = j;
					flag = true;
				}
			}
		}
		return answer;
	}
}