package java_first_project;
import java.util.Scanner;

public class ArrPrac {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] nums = new double[5];
		double sum = 0;

		System.out.println("5개의 정수를 입력하세요");

		for (int i = 0; i < 5; i++) {
			nums[i] = sc.nextDouble();
		}

		for (int j = 0; j < 5; j++) {
			sum += nums[j];
		}

		System.out.print("평균은 " + sum / 5);

		sc.close();
	}
}