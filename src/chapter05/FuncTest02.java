package chapter05;

import javax.swing.JOptionPane;

public class FuncTest02 {
	
	//�հ� �޼��� ����
		public static void sum(int num1,int num2) { //�Ű�����
			int num3=1; //��������
			int sum=num1+num2;
			System.out.println("�� ���� ��: "+sum);
			
		}

	public static void main(String[] args) {
		
		int a,b;
		
		a=Integer.parseInt(JOptionPane.showInputDialog("��1"));
		b=Integer.parseInt(JOptionPane.showInputDialog("��2"));
		
		//FuncTest02 obj=new FuncTest02(); //static�� �Ⱦ��� new�� ���� ����
		//obj.sum(a, b);                                                       
		sum(a,b);

	}
	//�޸� ����(����)
		//Data ����
		//���� ���� ����, ���� ������
		//���α׷� ���۽� �ڵ����� �޸� ������ �����ؼ� ���α׷� ����� �Ҹ�
		int globalVal=10; 
			
		//Stack ����
		//�޼���, ��������
		//ȣ���ϸ� �����ǰ� �Լ��� ȣ��Ǿ� ����� �����ָ� �Ҹ�
		void myFun() {
			int localVal=5; //��������
		}
			
		//Heap �޸�
		//��ü ����, �����ϴ� �޸�
		//����ڰ� ȣ��� �����ǰ� ����� ����Ǹ� ������
		FuncTest02 obj=new FuncTest02();

}
