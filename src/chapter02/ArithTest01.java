package chapter02;

public class ArithTest01 {

	public static void main(String[] args) {
		//������ ���
		
		int mathScore=96;
		int engScore=87;
		
		//����
		System.out.println("����: "+(mathScore+engScore));
		//���
		System.out.println("���: "+(mathScore+engScore)/2);
		System.out.println("-------------");
		
		double dNum=(mathScore+engScore)/2.0;
		System.out.println(dNum);
		System.out.println("���: "+(mathScore+engScore)/2.0);
		System.out.println("���: "+(mathScore+engScore)/2f);
		System.out.println("----------------");
		
		double total=mathScore+engScore;
		System.out.println("����: "+total);
		
		double average=total/2;
		System.out.println("���: "+average);
				

	}

}
