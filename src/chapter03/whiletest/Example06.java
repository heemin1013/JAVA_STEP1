package chapter03.whiletest;

import java.util.Scanner;

public class Example06 {

	public static void main(String[] args) {
		
		int cnt=0, num;
		boolean run = true;
		String str="";
		Scanner scan=new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1. �� ������ ���� | 2.�� ������ ���� ���� | 3.����");
			System.out.println("------------------------------------------");
			System.out.print("����>> ");
			num=Integer.parseInt(scan.nextLine());
			switch (num) {
			case 1:
				System.out.println("�� ������ ������ �����ϼ̽��ϴ�");
				System.out.print("�� ���� : ");
				cnt=Integer.parseInt(scan.nextLine());
				for(int i=1;i<=cnt;i++) {
					System.out.println("��"+i+"��");
				}
				System.out.println("��"+cnt+"���� �ϼ� �Ǿ����ϴ�");
				break;
			case 2:
				System.out.println("�� ������ ���� ������ �����ϼ̽��ϴ�");
				System.out.print("�� ���� : ");
				cnt=Integer.parseInt(scan.nextLine());
				System.out.print("�� ���� : ");
				str=scan.nextLine();
				for(int j=1;j<=cnt;j++) {
					System.out.println(str+"�� "+j+"��");
				}
				System.out.println("��û�Ͻ�"+cnt+"���� "+str+"���� �ϼ� �Ǿ����ϴ�");
				break;
			case 3:
				run=false;
				break;

			default:
				System.out.println("���ڸ� �ٽ� �Է����ּ���");
				break;
			}
			
			
		}
		System.out.println("���α׷� ����");

	}

}
