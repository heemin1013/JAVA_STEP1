package chapter03.whiletest;

public class Example02 {

	public static void main(String[] args) {
		// 팩토리얼 알고리즘
		/*
		 * 5! -> 5x4x3x2x1 => n! -> n*(n-1)*(n-2)*(n-3)*(n-4)
		 */
		
		int number=5;
		int factorial=1;
		//숫자가 0이하가 아닐때까지 반복하는 팩토리얼
		while(number>0) {
			factorial*=number;
			number--;
		}
		System.out.println("팩토리얼 결과: "+factorial);

	}

}
