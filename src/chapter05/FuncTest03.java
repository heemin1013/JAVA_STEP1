package chapter05;

public class FuncTest03 {
	
	public void Display1(String[] str) {
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]+" ");
		}
	}
	
	public static void Display2(String[] str) {
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]+" ");
		}
	}

	public static void main(String[] args) {
		String str[]= {"Java", "Oracle", "JSP", "HTML5", "CSS", "SpringBoot"};
		//stack에서 호출
		FuncTest03 dis=new FuncTest03();
		dis.Display1(str);
		
		//static메서드 호출
		Display2(str);
	}

}
