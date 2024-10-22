package chapter06;

public class Vending {
	
	//멤버변수
	private Can[] can=new Can[5];
	private int money;
	
	//기본생성자
	
	//메소드
	public void init() {
		can[0]=new Can("2%", 600);
		can[1]=new Can("환타", 1000);
		can[2]=new Can("포카리", 1200);
		can[3]=new Can("제티", 800);
		can[4]=new Can("박카스", 1000);
	}
	
	//사용가능한 음료만 보여주는 메서드
	public void showCan(int m) {
		money=m;
		for(int i=0;i<can.length;i++) {
			if(money>=can[i].getPrice()) {
				System.out.println(can[i].getCanName()+"-"+can[i].getPrice());
			}
		}
	}
	public void outCan(String name) {
		for(int i=0;i<can.length;i++) {
			if(name.equals(can[i].getCanName())) {
				System.out.println("요청하신 "+can[i].getCanName()+"를(을) 선택하셨습니다");
				System.out.println("잔액은 "+(money-can[i].getPrice())+"원 입니다");
			}
		}
	}

}
