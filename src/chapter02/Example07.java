package chapter02;

import java.util.Scanner;

public class Example07 {

	public static void main(String[] args) {
		// �� �ڸ��� ���ڸ� �Է¹޾� (scan)
		// ���ڰ� ¦������ Ȧ������ ����ϴ� ���α׷�(���� ������ ���)
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int number = scan.nextInt();
		/*
		String result = number % 2 == 0 ? "¦��" : "Ȧ��";
		System.out.println("Ȧ¦ ���� : " + result);
		*/
		
		int remainder=number % 2;
		boolean isOdd=remainder==1;
		String result=isOdd?"Ȧ��":"¦��";
		System.out.println(result);
		
	}

}
