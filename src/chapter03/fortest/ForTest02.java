package chapter03.fortest;

public class ForTest02 {

	public static void main(String[] args) {
		
		int i;
		int sum=0;
		System.out.println("===1���� 100������ ���� ���===");
		
		for(i=1;i<=100;i++) {
			sum+=i;
			System.out.print(i+ " ");
		}
		System.out.println();
		System.out.println("1���� 100������ ���� : "+sum+"�Դϴ�");
	}

}
