package java_first_project;
import java.util.Scanner;

public class LoopPrac {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");

		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			System.out.print(i + " ");
		}
		
		sc.close();
	}
}
