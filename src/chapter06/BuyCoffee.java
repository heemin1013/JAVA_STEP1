package chapter06;

public class BuyCoffee {

	public static void main(String[] args) {
		
		//�� �θ� ����
		Customer kim=new Customer("kim", 12000);
		Customer park=new Customer("park", 10000);
		
		//ī�� ����(ī�䰴ü�̸� -> ���̳��� Ŀ��)
		Cafe cafe=new Cafe("���̳��� Ŀ��");
		
		//ī��湮
		kim.visitCafe(cafe, 4000);
		park.visitCafe(cafe, 4500);
		
		//ī������
		cafe.showInfo();
		//������ ����
		kim.showInfo();
		park.showInfo();

	}

}
