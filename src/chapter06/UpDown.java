package chapter06;

import java.util.Random;

public class UpDown {

	//멤버변수
	private int pcnum=new Random().nextInt(50)+1; //1~50정수 추출
	private int count=0;
	private String result="FAIL";
	//생성자
	
	//메서드
	
	public String check(int mynumber) {
		//random(pcnum)값보다 작으면 up, 크면 down, 일치하면 result="SUCCESS"
		count++;
		if(pcnum>mynumber) {
			System.out.println("Up");
		}else if(pcnum<mynumber) {
			System.out.println("Down");
		}else{
			System.out.println(count+"회 만에 정답!!");
			result="SUCCESS";
		}
		return result;
	}
	
}
