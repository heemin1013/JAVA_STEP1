package chapter04;

public class ArrayTest08 {

	public static void main(String[] args) {
		
		int score[]= {98,90,87};
		int sum=0;
		
		for(int i=0;i<score.length;i++) {
			System.out.println("score["+i+"]: "+score[i]);
			sum+=score[i];
		}
		double avg=(double)sum/score.length;
		System.out.println("�հ�: "+sum);
		System.out.println("���: "+avg);
		System.out.println("���(�ݿø�): "+Math.round(avg));

	}

}
