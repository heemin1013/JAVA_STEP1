package chapter05;

public class FunTest_Overload {
	
	//�������=�ʵ�=�Ӽ�
	
	
	//������(����Ʈ ����)
	
	//�޼���
	
	//�����ε�: ���� �̸��� �޼��带 �Ű������� �ٸ��� �����
	public void getResult(int a) {
		System.out.println(a+"��(��) int �Դϴ�");
	}
	public void getResult(char ch) {
		System.out.println(ch+"��(��) char �Դϴ�");
	}
	public void getResult(String str) {
		System.out.println(str+"��(��) String �Դϴ�");
	}
	public void getResult(int x, String str) {
		System.out.println(x+"��(��) int �̰�"+str+"��(��) String �Դϴ�");
	}

}
