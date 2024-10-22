package chapter05;

public class Example02 {
	
	/*두 정수를 입력받아서(=매개변수) 그 합을 계산하는 메소드를 구현해보세요.*/
	
	public int sum1(int a, int b) {
		return a+b;
	}
	public static void sum2(int a, int b) {
		System.out.println("합계: "+(a+b));
	}

	public static void main(String[] args) {
		int num1=10;
		int num2=20;
		
		//반환값이 있는 메서드
		Example02 num=new Example02();
		int sum1=num.sum1(num1,num2);
		System.out.println("합계: "+sum1);
		
		//반환값이 없음
		sum2(num1,num2);
	}

}
