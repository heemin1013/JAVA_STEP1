package chapter07;

public class CarMain {

	public static void main(String[] args) {
		
		Car myCar=new Car("����", 3000);
		//��������� �̿��Ͽ� ���� ����
		myCar.color="ȭ��Ʈ";
		
		//������� �̿�
		System.out.println(myCar.color);
		System.out.println(myCar.cc);
		//�޼��� �̿�
		System.out.println(myCar.getColor());
		System.out.println(myCar.getCc());

	}

}
