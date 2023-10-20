package java_first_project;
import java.util.Scanner;

public class Scan {
	public static void main(String[] args) {
		System.out.println("이름, 나이, 키, 결혼 여부를 빈칸으로 분리하여 입력하세요.");
		Scanner sc = new Scanner(System.in);
		// System.in: 표준 입력 스트림을 나타내며, 주로 키보드 입력을 위해 사용

		String name = sc.next(); // 공백 이전까지의 문자열 읽기
		int age = sc.nextInt(); // 정수 읽기
		double height = sc.nextDouble(); // 실수 읽기
		boolean marry = sc.nextBoolean(); // 논리값 읽기

		System.out.printf("이름은 %s, 나이는 %d, 키는 %.1f, 결혼은 %b", name, age, height, marry);

		sc.close();
	}

}
