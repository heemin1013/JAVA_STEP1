package chapter06;

public class StudentMain {

	public static void main(String[] args) {
		//����Ʈ �����ڷ� ��ü ����
		Student student1=new Student();
		student1.studentName="�ֹ鼳";
		student1.address="�ϻ�";
		student1.showStudentInfo();
		

		
		//�����ڸ� ���ؼ� �ʱ�ȭ �Ͽ� showStudentInfo()�� ���
		Student student2=new Student("�ֹ鼳", "�ϻ굿��");
		student2.showStudentInfo();
		
		Student student3=new Student();
		student3.setStudentName("�ֹ鼳");
		student3.setAddress("�ϻ�");
		System.out.println(student3.getStudentName()+", "+student3.getAddress());
		student3.showStudentInfo();

	}

}
