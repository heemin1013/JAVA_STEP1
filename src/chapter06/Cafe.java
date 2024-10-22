package chapter06;

public class Cafe {
	
	public String name;
	public int sales;
	
	//생성자
	public Cafe(String name) {
		this.name = name;
	}


	public void sell(int amount) {//음료 구매후 카페의 수입이 증가
		sales+=amount;
	}
	
	public void showInfo() {
		System.out.println(name+" 카페의 매출은 "+sales+"원 입니다");
	}

}
