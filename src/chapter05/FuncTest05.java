package chapter05;

import java.util.Scanner;

public class FuncTest05 {
	
	public static int EduStep(int num) {
		switch (num) {
		case 1:
			System.out.println(num+"�ܰ��� ���͵� �����ϼ̽��ϴ�");
			break;
		case 2:
			System.out.println(num+"�ܰ��� ���͵� �����ϼ̽��ϴ�");
			break;
		case 3:
			System.out.println(num+"�ܰ��� ���͵� �����ϼ̽��ϴ�");
			break;	

		default:
			System.out.println("���͵� �ܰ谡 �����ϴ�");
			break;
		}
		return num;
	}

	public static void main(String[] args) {
		
		//����ڷκ��� ���͵� �ܰ踦 �Է¹޾Ƽ� EduStep ȣ���ϱ�
		Scanner scan=new Scanner(System.in);
		System.out.print("���͵� �ܰ踦 �Է��ϼ���: ");
		int number=scan.nextInt();
		//EduStep(number); //number�� �� �Ű����� //void�϶�
		int num1=EduStep(number);
		System.out.println("����� ����: "+num1);

	}

}
