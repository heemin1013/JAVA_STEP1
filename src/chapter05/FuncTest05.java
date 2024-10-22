package chapter05;

import java.util.Scanner;

public class FuncTest05 {
	
	public static int EduStep(int num) {
		switch (num) {
		case 1:
			System.out.println(num+"단계의 스터디를 선택하셨습니다");
			break;
		case 2:
			System.out.println(num+"단계의 스터디를 선택하셨습니다");
			break;
		case 3:
			System.out.println(num+"단계의 스터디를 선택하셨습니다");
			break;	

		default:
			System.out.println("스터디 단계가 없습니다");
			break;
		}
		return num;
	}

	public static void main(String[] args) {
		
		//사용자로부터 스터디 단계를 입력받아서 EduStep 호출하기
		Scanner scan=new Scanner(System.in);
		System.out.print("스터디 단계를 입력하세요: ");
		int number=scan.nextInt();
		//EduStep(number); //number는 실 매개변수 //void일때
		int num1=EduStep(number);
		System.out.println("당신의 선택: "+num1);

	}

}
