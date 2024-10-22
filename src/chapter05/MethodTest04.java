package chapter05;

public class MethodTest04 {

	public static void main(String[] args) {
		
		int sum =add(5,10);
		double sumDouble=add(3.5,7.2);
		
		System.out.println("합계(int): "+sum);
		System.out.println("합계(Double): "+sumDouble);

	}
	
	public static int add(int a, int b) {
		int sum=a+b;
		return sum;
	}
	
	public static double add(double a, double b) {
		double sum=a+b;
		return sum;
	}

}
