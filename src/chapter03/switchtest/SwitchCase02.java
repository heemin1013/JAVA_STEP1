package chapter03.switchtest;

import javax.swing.JOptionPane;

public class SwitchCase02 {

	public static void main(String[] args) {
		
		int num;
		num=Integer.parseInt(JOptionPane.showInputDialog("1~4������ ��ȣ�� �Է��ϼ���"));
		
		switch (num) {
		case 1:
			System.out.println("������ȸ�� �����ϼ̽��ϴ�.");
			break;
		case 2:
			System.out.println("��ݸ� �����ϼ̽��ϴ�.");
			break;
		case 3:
			System.out.println("�ӱݸ� �����ϼ̽��ϴ�.");
			break;
		case 4:
			System.out.println("�۱ݸ� �����ϼ̽��ϴ�.");
			break;

		default:
			System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�.");
			break;
		}

	}

}
