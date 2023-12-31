package java_first_project;

public class ArrEx2 {

	public static void main(String[] args) {
		// 2차원배열로 1~4학년까지의 평점 구하기
		double[][] score = { { 3.5, 3.7 }, { 4.0, 4.1 }, { 3.2, 3.0 }, { 3.8, 3.0 } };

		double sum = 0;

		for (int i = 0; i < score.length; i++) { // 학년별
			for (int j = 0; j < score[i].length; j++) { // 학년의 학기별
				sum += score[i][j]; // 전체 평점 합
			}
		}

		int n = score.length; // 4
		int m = score[0].length; // 2

		System.out.print(sum / (n * m));
	}
}