package chapter02;

public class Example02 {

	public static void main(String[] args) {
		/*soldesk ������
		 * ��, ���, �������� Ű��� �ִµ� �Ϸ翡 ����Ǵ� ���� ���� 5��, 7��, 5�� �Դϴ�.
		 * ���������� �Ϸ翡 ����Ǵ� �� ������ ������ ����ϰ�,
		 * �ð���(24) ��ü ������ ��� ���� ������ ��� �Ͻÿ�.
		 * (��, ��հ��� ��� ������ Ÿ���� float)�� �����Ѵ�.
		 */
		int pear=5;
		int apple=7;
		int orange=5;
		
		int total=pear+apple+orange;
		float avarage=total/24f;
		
		System.out.println("�Ѱ��� ����: "+total);
		System.out.println("��� ���� ����: "+avarage);

	}

}
