package chapter07;

public class ThisExample {

	public static void main(String[] args) {
		
		ThisEx birth1=new ThisEx();
		
		birth1.printThis(); //��ü�� �ּ� ��ȯ
		birth1.setYear(2024);
		birth1.setMonth(10);
		birth1.setDay(7);
		System.out.println("�������: "+birth1.year+"."+birth1.month+"."+birth1.day);
		
		//������ �ʱ�ȭ
		ThisEx birth2=new ThisEx(14, 10, 2024);
		birth2.printThis();
		System.out.println("�������: "+birth2.year+"."+birth2.month+"."+birth2.day);
		
		//getter
		ThisEx birth3=new ThisEx(14, 10, 2024);
		birth3.printThis();
		System.out.print("�������: ");
		System.out.print(birth3.getYear());
		System.out.print(birth3.getMonth());
		System.out.print(birth3.getDay());
		
		
		
	}

}
