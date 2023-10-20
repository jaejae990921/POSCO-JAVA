package java_first_project;
import java.util.Scanner;

public class ConditionPrac1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();

		if (1 <= age && age <= 7) {
			System.out.print("유아");
		} else if (8 <= age && age <= 13) {
			System.out.print("초등학생");
		} else if (14 <= age && age <= 16) {
			System.out.print("중학생");
		} else if (17 <= age && age <= 19) {
			System.out.print("고등학생");
		} else {
			System.out.print("성인");
		}
		
		sc.close();
	}
}
