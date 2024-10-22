package chapter05;

public class FunTest_Overload {
	
	//멤버변수=필드=속성
	
	
	//생성자(디폴트 생략)
	
	//메서드
	
	//오버로딩: 같은 이름의 메서드를 매개변수만 다르게 만든다
	public void getResult(int a) {
		System.out.println(a+"은(는) int 입니다");
	}
	public void getResult(char ch) {
		System.out.println(ch+"은(는) char 입니다");
	}
	public void getResult(String str) {
		System.out.println(str+"은(는) String 입니다");
	}
	public void getResult(int x, String str) {
		System.out.println(x+"은(는) int 이고"+str+"은(는) String 입니다");
	}

}
