package chapter06;

public class StudentInfoMain {

	public static void main(String[] args) {
		//������ �����ε��� �̿��� ������� �ʱ�ȭ
		StudentInfo info=new StudentInfo(1004, "�ֹ鼳", 1, "�ϻ�");
		System.out.println(info.address);
		
		//�⺻ �����ڷ� ��ü����
		StudentInfo info1=new StudentInfo();
		//�������� �ʱ�ȭ
		info1.address="���α�";
		System.out.println(info1.address);
		
		StudentInfo studentkim=new StudentInfo();
		//getters and setters
		studentkim.setStudentName("������");
		String sname=studentkim.getStudentName();
		System.out.println(sname);
	}

}
