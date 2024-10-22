package chapter03.iftest;

import javax.swing.JOptionPane;

public class IfExample04 {

	public static void main(String[] args) {
		/*전시관의 입장료는 미취학 아동은 1000원 ->7
		전시관의 입장료는 초등학생은 2000원->13
		전시관의 입장료는 중,고등학생은 3500원 ->19
		전시관의 입장료는 성인은 5000원*/
		
		int age;
		int charge=0;
		
		age=Integer.parseInt(JOptionPane.showInputDialog("나이를 입력하세요"));
		
		if(age>19) {
			charge=5000;
		}else if(age>13) {
			charge=3500;
		}else if(age>7) {
			charge=2000;
		}else {
			charge=1000;
		}   
		  
		
		System.out.println("전시관 입장료는 "+charge+"원 입니다.");

	}

}
