package chapter03.iftest;

import javax.swing.JOptionPane;

public class IfExample04 {

	public static void main(String[] args) {
		/*���ð��� ������ ������ �Ƶ��� 1000�� ->7
		���ð��� ������ �ʵ��л��� 2000��->13
		���ð��� ������ ��,����л��� 3500�� ->19
		���ð��� ������ ������ 5000��*/
		
		int age;
		int charge=0;
		
		age=Integer.parseInt(JOptionPane.showInputDialog("���̸� �Է��ϼ���"));
		
		if(age>19) {
			charge=5000;
		}else if(age>13) {
			charge=3500;
		}else if(age>7) {
			charge=2000;
		}else {
			charge=1000;
		}   
		  
		
		System.out.println("���ð� ������ "+charge+"�� �Դϴ�.");

	}

}
