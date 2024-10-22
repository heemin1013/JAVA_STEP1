package chapter01;

public class LongVariable04 {
	
	public static void main(String[] args) {
		// Long Type
		//int num1=12345678900; //int -> 32bit
		long num2=12345678900L; //long -> 64bit
		//long형의 64비트 자료지만 L이 선언되어 있지 않으면 int에 대입하여 자동 형변환
		long num3=1000;
		
		System.out.println(num2);
		System.out.println(num3);
		
		//num3=12345678900L;
		
		int level; //선언만 하고 초기화 하지 않음
		level=10; // 리터럴 값
		
		System.out.println(level);
		System.out.println(num2+num3);
		
	}

}
