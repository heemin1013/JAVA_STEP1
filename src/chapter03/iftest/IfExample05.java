package chapter03.iftest;

import javax.swing.JOptionPane;

public class IfExample05 {

	public static void main(String[] args) {
		int num1, num2;
		num1=0;
		num2=0;
		num1 = Integer.parseInt(JOptionPane.showInputDialog("값1"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("값2"));
		
		if(num1>num2) {
			System.out.println("num1이 큽니다");
		}else if(num1==num2) {
			System.out.println("두 수는 같습니다");
		}else if(num1<num2) {
			System.out.println("num2가 큽니다");
		}else {
			System.out.println("어허~~~~ 제대로 적으세요");
		} 

	}

}
