package chapter02;

import java.util.Scanner;

public class Example03 {
	// �������� ����ϴ� ������ ����
	public static void main(String[] args) {
		// #1
		// ���׿����ڸ� �̿��Ͽ� score1�� 60 ���� ũ�ų� ������ �հ�
		// �׷��� ������ ���հ����� ��ȯ �Ͻÿ�.
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int score1 = scan.nextInt();
		String pass = score1 >= 60 ? "�հ�" : "���հ�";
		System.out.println(pass+"�Դϴ�");

		// #2
		// ���׿����ڸ� �̿��Ͽ� score2�� 90���� ũ�� 'A'�̰�
		// score2�� 80���� ũ�� 'B' �� ���ϴ� ��� 'C'�� �����Ѵ�

		System.out.print("���� �Է�: ");
		int score2 = scan.nextInt();
		String pass1 = score2 > 90 ? "A" : (score2 > 80) ? "B" : "C";
		System.out.println("����: "+pass1);
		

	}

}
