package chapter03.whiletest;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		
		boolean run=true;
		int balance=0; //����(+), ���(-)
		
		Scanner scan= new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-------------------------------------");
			System.out.print("����> ");
			//nextLine()�� ������ ���Ϳ� �������
			//int menuNum=Integer.parseInt(scan.nextLine());
			//nextInt()�� ������ �������� ���͸� �Է��ϸ� ������ ���ڿ����� �Էµ�
			int menuNum=scan.nextInt();
			
			switch (menuNum) {
			case 1:
				System.out.print("���ݾ�> ");
				int money1=scan.nextInt();
				//int money1=Integer.parseInt(scan.nextLine());
				balance+=money1;
				break;
			case 2:
				System.out.print("��ݾ�> ");
				int money2=scan.nextInt();
				//int money2=Integer.parseInt(scan.nextLine());
				balance-=money2;
				break;
			case 3:
				System.out.println("�ܰ�: "+balance);
				break;
			case 4:
				run=false;
				break;
			default:
				System.out.println("���ڸ� �ٽ� �Է����ּ���!");
				break;
			}
			System.out.println();
			
		}
		System.out.println("���α׷� ����");

	}

}
