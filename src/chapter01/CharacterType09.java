package chapter01;

public class CharacterType09 {

	public static void main(String[] args) {
		// A:65 a:97 => ASCII 코드
		
		int a=65;
		System.out.println(a);
		System.out.println("사칙연산(+): "+(a+10));
		System.out.println("---------------");
		//명시적 형변환 => int->char : ASCII
		System.out.println((char)a);
		System.out.println((char)(a+1));
		System.out.println("---------------");
		int a2=97;
		System.out.println(a2);
		System.out.println((char)a2);

	}

}
