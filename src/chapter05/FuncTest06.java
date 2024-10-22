package chapter05;

import java.util.Scanner;

public class FuncTest06 {
	
	public static String EduStep(int num) {
		String step="";
		
		switch (num) {
		case 1:
			step="초급";
			break;
		case 2:
			step="중급";
			break;
		case 3:
			step="고급";	
			break;
		default:
			System.out.println("잘못 입력했습니다");
			step="판별불가";
			break;
		}
		return step;
		
	}

	public static void main(String[] args) {
		// 사용자로부터 스터디 단계를 입력받아서 EduStep 호출하기
		Scanner scan = new Scanner(System.in);
		System.out.print("스터디 단계를 입력하세요: ");
		int number = scan.nextInt();
		//1:초급 2:중급 3:상급
		
		String step=EduStep(number);
		System.out.println("현재 수업 단계는 "+step+"입니다.");

	}

}
