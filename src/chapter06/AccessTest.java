package chapter06;

public class AccessTest {

	//�������=�ʵ�
	private int aa; //���� Ŭ���������� ��� ����
	public int bb; //���������� ����(�ٸ� Ŭ���������� ��� ����)
	int cc; //public�� ����
	
	//����Ʈ ������
	
	//�޼���
	public void setAa(int aa) {
		this.aa = aa;
	}

	public void setBb(int bb) {
		this.bb = bb;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}
	
	public void Disp() {
		System.out.println("aa��: "+aa+" bb��: "+bb+" cc��: "+cc);
	}
	
	public static void main(String[] args) {
		
		AccessTest obj=new AccessTest();
		
		//aa�ʱ�ȭ ���
		//obj.aa=10;
		//System.out.println(obj.aa);
		obj.setAa(20);
		System.out.println("obj.setAa(20): "+obj.aa);
		obj.bb=30;
		System.out.println("obj.bb=30: "+obj.bb);
		obj.setCc(40);
		System.out.println("obj.setCc(40): "+obj.cc);
		
		obj.Disp();
		

	}

	

}
