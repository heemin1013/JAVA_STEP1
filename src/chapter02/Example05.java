package chapter02;

import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {
		/* �����濡 51�� ����(������ : number)
		 �� ���� ������� ���θ� �Ǻ��ϴ� ���α׷�
		 �����濡 ����� ���� ����� "����Դϴ�"
		 �׷��� ���� ��� "���� �Ǵ� 0�Դϴ�."��� ����� �Ǿ���� 
		 */
		
		//���� �ʱ�ȭ
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int number=scan.nextInt();
		boolean isPositive=number>0;
		String result=isPositive?"����Դϴ�":"���� �Ǵ� 0�Դϴ�";
		System.out.println(result);
		System.out.println("----------------------");
		int _num=-5;
		String numResult=(_num>0)?"����Դϴ�":"���� �Ǵ� 0�Դϴ�";
		System.out.println(numResult);
		

	}

}
