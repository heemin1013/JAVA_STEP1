package chapter06;

public class BuyCoffee {

	public static void main(String[] args) {
		
		//고객 두명 생성
		Customer kim=new Customer("kim", 12000);
		Customer park=new Customer("park", 10000);
		
		//카페 생성(카페객체이름 -> 힘이나는 커피)
		Cafe cafe=new Cafe("힘이나는 커피");
		
		//카페방문
		kim.visitCafe(cafe, 4000);
		park.visitCafe(cafe, 4500);
		
		//카페정보
		cafe.showInfo();
		//고객들의 정보
		kim.showInfo();
		park.showInfo();

	}

}
