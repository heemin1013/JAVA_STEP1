package chapter03.iftest;

import javax.swing.JOptionPane;

public class IfExample05 {

	public static void main(String[] args) {
		int num1, num2;
		num1=0;
		num2=0;
		num1 = Integer.parseInt(JOptionPane.showInputDialog("��1"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("��2"));
		
		if(num1>num2) {
			System.out.println("num1�� Ů�ϴ�");
		}else if(num1==num2) {
			System.out.println("�� ���� �����ϴ�");
		}else if(num1<num2) {
			System.out.println("num2�� Ů�ϴ�");
		}else {
			System.out.println("����~~~~ ����� ��������");
		} 

	}

}
