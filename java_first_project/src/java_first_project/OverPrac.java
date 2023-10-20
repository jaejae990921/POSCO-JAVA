package java_first_project;
import java.util.Scanner;

public class OverPrac {
	public void cal(double a, double b) {
		System.out.println("덧셈 결과 : " + (a + b));
		System.out.println("뺄셈 결과 : " + (a - b));
		System.out.println("나눗셈 결과 : " + (a / b));
		System.out.println("곱셈 결과 : " + (a * b));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		OverPrac calc = new OverPrac();

		System.out.println("숫자 두 개를 입력하세요");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		calc.cal(a, b);
		sc.close();
	}
}
