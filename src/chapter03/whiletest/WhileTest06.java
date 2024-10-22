package chapter03.whiletest;

import java.util.Scanner;

public class WhileTest06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num, cnt = 0, sum = 0;
		double avg;

		while (true) {
			System.out.print("숫자를 입력하세요 : ");
			num = scan.nextInt();

			if (num == 0) {
				break;
			}

			cnt++; // 숫자가 몇 개 입력되었는지 체크
			sum += num; // 누적 합

		}
		avg = (double) sum / cnt;

		System.out.print("입력된 숫자의 개수 : " + cnt + "\n");
		System.out.print("입력된 숫자의 합계 : " + sum + "\n");
		System.out.print("입력된 숫자의 평균 : " + Math.round(avg * 1000.0) / 1000 + "\n");
		//System.out.printf("입력된 숫자의 평균 : %.3f", avg);

	}

}
