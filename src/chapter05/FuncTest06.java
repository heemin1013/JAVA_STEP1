package chapter05;

import java.util.Scanner;

public class FuncTest06 {
	
	public static String EduStep(int num) {
		String step="";
		
		switch (num) {
		case 1:
			step="�ʱ�";
			break;
		case 2:
			step="�߱�";
			break;
		case 3:
			step="���";	
			break;
		default:
			System.out.println("�߸� �Է��߽��ϴ�");
			step="�Ǻ��Ұ�";
			break;
		}
		return step;
		
	}

	public static void main(String[] args) {
		// ����ڷκ��� ���͵� �ܰ踦 �Է¹޾Ƽ� EduStep ȣ���ϱ�
		Scanner scan = new Scanner(System.in);
		System.out.print("���͵� �ܰ踦 �Է��ϼ���: ");
		int number = scan.nextInt();
		//1:�ʱ� 2:�߱� 3:���
		
		String step=EduStep(number);
		System.out.println("���� ���� �ܰ�� "+step+"�Դϴ�.");

	}

}
