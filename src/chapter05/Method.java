package chapter05;

import java.util.Scanner;

public class Method {
	//�޼����� �����ε�
	public void makeBread() {
		System.out.println("���� ����ϴ�.");
	}
	
	void makeBread(int cnt) {
		for(int i=1;i<=cnt;i++) {
			System.out.println("��"+i+"��");
		}
		System.out.println("��"+cnt+"���� �ϼ� �Ǿ����ϴ�");
	}
	void makeBread(int cnt, String str) {
		for(int j=1;j<=cnt;j++) {
			System.out.println(str+"�� "+j+"��");
		}
		System.out.println("��û�Ͻ�"+cnt+"���� "+str+"���� �ϼ� �Ǿ����ϴ�");
	}
	
	//-----------------------------
	void order() {
		
		boolean run=true;
		
		Scanner scan=new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1. �� ������ ���� | 2.�� ������ ���� ���� | 3.����");
			System.out.println("------------------------------------------");
			System.out.print("����>> ");
			
			int input_num=Integer.parseInt(scan.nextLine());
			
			switch (input_num) {
			case 1:
				System.out.print("�� ������ �Է�: ");
				int cnt1=Integer.parseInt(scan.nextLine());
				makeBread(cnt1);
				break;
			case 2:
				System.out.println("�� ������ ���� ������ �����ϼ̽��ϴ�");
				System.out.print("�� ���� : ");
				int cnt2=Integer.parseInt(scan.nextLine());
				System.out.print("�� ���� : ");
				String str=scan.nextLine();
				makeBread(cnt2, str);
				break;
			case 3:
				System.out.println("���α׷� ����");
				run=false;
				break;
			default:
				System.out.println("���ڸ� �ٽ� �Է����ּ���");
				break;
			}
			
		}
	}
}
