package chapter03.switchtest;

public class SwitchCase06 {

	public static void main(String[] args) {
		
		int time=(int)(Math.random()*10)+9;
		System.out.println("[����ð�: "+time+ "��]");
		System.out.print("�� �� : ");
		
		switch (time) {
		case 9:
			System.out.println("��ħ�Ա� �ð�~");
			break;
		case 10: case 11: case 12:
			System.out.println("��ǻ�� �����ϱ�!~~~");
			break;
		case 13: case 14:
			System.out.println("���ɽð�~~~");
			break;
		case 15: case 16: 
			System.out.println("ģ���� ������ ���");
			break;
		case 18:
			System.out.println("����Ա�!~~~");
			break;

		default:
			System.out.println("�۶�����!~~~~~");
			break;
		}

	}

}
