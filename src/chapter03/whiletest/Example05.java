package chapter03.whiletest;

import java.util.Random;
import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {
		/*���� ���߱� ����
		1���� 100���� ������ ���ڸ� �����ϰ�, ���ڸ� ���ߴ� ����
		���� �Է��� ���ڰ� ��ǻ�Ͱ� ������ ���ں��� ũ�� "�� ���� ���ڸ� �����ϼ���" ���
		���� �Է��� ���ڰ� ��ǻ�Ͱ� ������ ���ں��� ������ "�� ū ���ڸ� �����ϼ���" ���
		������ ���ڸ� ��Ȯ�� ���� ������ ������ �ݺ�
		���⶧���� �ɸ� �õ� Ƚ���� ����Ͽ� ������ �޽����� ���*/
		Scanner scan = new Scanner(System.in);
		
		Random random=new Random();
		//pc�� ���� ����
		int targetNumber=random.nextInt(100)+1;
		int guest=0;
		int count=0;
		boolean run=true;
		/*
		while(run) {
			System.out.print("1���� 100������ ���� �� �ϳ��� �������� : ");
			guest=scan.nextInt();
			count++;
			
			if(guest>targetNumber) {
				System.out.println("�� ���� ���ڸ� �����ϼ���");
				
			}else if(guest<targetNumber) {
				System.out.println("�� ū ���ڸ� �����ϼ���");
				
			}else if(guest==targetNumber) {
				
				run=false;
			}
			System.out.println();
		}
		*/
		do {
			System.out.print("1���� 100������ ���� �� �ϳ��� �������� : ");
			guest=scan.nextInt();
			count++;
			if(guest>targetNumber) {
				System.out.println("�� ���� ���ڸ� �����ϼ���");
				
			}else if(guest<targetNumber) {
				System.out.println("�� ū ���ڸ� �����ϼ���");
				
			}
			System.out.println();
			
		}while(guest!=targetNumber);
		
		System.out.println("�����մϴ�. ! "+count+"�� ���� ���߾����ϴ�");
		System.out.println("PC�� ������ ���� : "+targetNumber);
		System.out.println("User�� ������ ���� : "+guest);

	}

}
