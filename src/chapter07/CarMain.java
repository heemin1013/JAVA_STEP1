package chapter07;

public class CarMain {

	public static void main(String[] args) {
		
		Car myCar=new Car("검정", 3000);
		//멤버변수를 이용하여 색깔 변경
		myCar.color="화이트";
		
		//멤버변수 이용
		System.out.println(myCar.color);
		System.out.println(myCar.cc);
		//메서드 이용
		System.out.println(myCar.getColor());
		System.out.println(myCar.getCc());

	}

}
