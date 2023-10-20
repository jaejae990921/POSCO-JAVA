package java_first_project;
import java.util.Scanner;

public class OverPrac2 {
	public double cal(double a) {
		return a * a * Math.PI;
	}

	public double cal(double a, double b) {
		return a * b;
	}

	public double cal(double a, double b, double c) {
		return a * b / c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		OverPrac2 calc = new OverPrac2();
		System.out.printf("반지름이 5인 원의 넓이 : %.14f", calc.cal(5)).println();
		System.out.printf("가로 4, 세로 7인 직사각형의 넓이 : %.1f", calc.cal(4, 7)).println();
		System.out.printf("밑변 6, 높이 3인 삼각형의 넓이 : %.1f", calc.cal(6, 3, 2));
		
		sc.close();
	}

}
