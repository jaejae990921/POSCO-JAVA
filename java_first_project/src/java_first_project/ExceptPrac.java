package java_first_project;

public class ExceptPrac {

	public static void main(String[] args) {
		int[] intArray = { 1, 2, 3, 4 };
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(intArray[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스가 범위를 벗어났습니다.");
			System.out.println(e);
		}
	}
}
