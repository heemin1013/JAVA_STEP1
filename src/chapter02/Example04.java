package chapter02;

public class Example04 {

	public static void main(String[] args) {
		
		long num1=10; //묵시적 형변환으로 int로 됨
		double pi=3.14;
		double result=num1*num1*pi;
		System.out.println("반지름이 10인 원의 넓이: "+result);

	}

}
