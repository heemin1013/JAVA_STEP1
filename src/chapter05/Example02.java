package chapter05;

public class Example02 {
	
	/*�� ������ �Է¹޾Ƽ�(=�Ű�����) �� ���� ����ϴ� �޼ҵ带 �����غ�����.*/
	
	public int sum1(int a, int b) {
		return a+b;
	}
	public static void sum2(int a, int b) {
		System.out.println("�հ�: "+(a+b));
	}

	public static void main(String[] args) {
		int num1=10;
		int num2=20;
		
		//��ȯ���� �ִ� �޼���
		Example02 num=new Example02();
		int sum1=num.sum1(num1,num2);
		System.out.println("�հ�: "+sum1);
		
		//��ȯ���� ����
		sum2(num1,num2);
	}

}
