package chapter06;

public class Vending {
	
	//�������
	private Can[] can=new Can[5];
	private int money;
	
	//�⺻������
	
	//�޼ҵ�
	public void init() {
		can[0]=new Can("2%", 600);
		can[1]=new Can("ȯŸ", 1000);
		can[2]=new Can("��ī��", 1200);
		can[3]=new Can("��Ƽ", 800);
		can[4]=new Can("��ī��", 1000);
	}
	
	//��밡���� ���Ḹ �����ִ� �޼���
	public void showCan(int m) {
		money=m;
		for(int i=0;i<can.length;i++) {
			if(money>=can[i].getPrice()) {
				System.out.println(can[i].getCanName()+"-"+can[i].getPrice());
			}
		}
	}
	public void outCan(String name) {
		for(int i=0;i<can.length;i++) {
			if(name.equals(can[i].getCanName())) {
				System.out.println("��û�Ͻ� "+can[i].getCanName()+"��(��) �����ϼ̽��ϴ�");
				System.out.println("�ܾ��� "+(money-can[i].getPrice())+"�� �Դϴ�");
			}
		}
	}

}
