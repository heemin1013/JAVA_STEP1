package chapter06;

public class Subway {

	public String lineNumber;
	public int passengerCount;
	public int money;
	//생성자 lineNumber초기화
	public Subway(String lineNumber) {
		this.lineNumber=lineNumber;
	}
	//take메서드
	public void take(int money) {
		this.money+=money;//버스 수입
		passengerCount++;//승객의 수 증가
	}
	
	public void showInfo() {
		System.out.println(lineNumber+"선 지하철의 승객은 "
	     +passengerCount+"명이고, 수입은 "+money+"원 입니다.");
		
	}
	
}
