package chapter05;

class MyObject{
	//멤버변수
	int value;
	
	//생성자
	public MyObject(int value) {
		this.value = value;
	}
	
}

public class FuncTest09 {
	
	
	public static void changeValue(MyObject object) {
		object.value=20;
	}

	public static void main(String[] args) {
		
		MyObject obj=new MyObject(10);
		
		System.out.println("Before: "+obj.value);
		changeValue(obj); //Call by Reference
		System.out.println("After: "+obj.value);

	}

}
