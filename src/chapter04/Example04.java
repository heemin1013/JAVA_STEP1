package chapter04;

import java.util.Scanner;

public class Example04 {

	public static void main(String[] args) {
		// ����ڿ��� �˰���� ���ڸ� 1�������� 10���� �Է� �޾�,
		// �ش� ������ �ε����� ã�� ����ϴ� ���α׷��� ���弼��.
		// ��, ����ڰ� �Է��� ���� �迭 �ε����� ��Ÿ�� �� ���� ��� ã�� �� ���ٴ� ������ ����ϼ���.
		
		Scanner scan=new Scanner(System.in);
		
		int[] numbers = { 10, 3, 2, 1, 4, 8, 7, 9, 5, 6};
		int target; //�˰���� ����
		int index =-1; 
		//�迭 ������ ã�� ������ ��� �ʱ�ȭ.
		System.out.print("�˰� ���� ���� �Է�: ");
		target=scan.nextInt();
		for(int i=0;i<numbers.length;i++) {
			if(target==numbers[i]) {
				index=i;
				break;
			}
		}
		if(index!=-1) {
			System.out.println(target+"��(��)"+index+"��° index�� ����");
		}else {
			System.out.println("�˰���� ������ ��ġ�� ã�� ���߽��ϴ�");
		}
		
		

	}

}
