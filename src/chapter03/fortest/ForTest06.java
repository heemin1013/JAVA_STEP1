package chapter03.fortest;

public class ForTest06 {

	public static void main(String[] args) {
		// 1�������� 100������ �� �߿��� 3�� ����� ã�� ���� ����ϼ���
		
		int num;
		int total=0;
		
		for(num=0;num<=100;num++) {
			if(num%3==0) {
				total+=num;
			}
		}System.out.println("3�� ����� ����: "+total);
	}

}
