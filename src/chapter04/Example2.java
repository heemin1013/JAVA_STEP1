package chapter04;

public class Example2 {

	public static void main(String[] args) {

		// for���� �̿��Ͽ� ���� �迭�� ������ �ٴ����� ������ ����� ����ϰ� ��ü ������ ������
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };//3�� x��

		double avg = 0;//�� ���� ���
		double totalavg=0;//��ü ����� ���
		int total=0;//�� ���� ��
		int alltotal=0;//��ü ����� ��
		int count = 0;

		
		//for���� �̿� -> �� ���� �����ͼ� ������ ���� �о sum�� �����ϰ�(count++) 
		//��ձ��� ���Ͽ� ���
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				total+=array[i][j];
				count++;//��ü ��տ� ���� ī��Ʈ
			}
			avg=(double)total/array[i].length;
			alltotal+=total;
			System.out.println((i+1)+"�� �հ�: "+total);
			System.out.println((i+1)+"�� ���: "+avg);
			System.out.println("-------------");
			total=0; //���� ���� ����� ���ؼ� �����Ⱚ ����
		}
		System.out.println("��ü ��: "+alltotal);
		totalavg=(double)alltotal/count;
		System.out.println("��ü �������� ���: "+totalavg);
		

	}

}
