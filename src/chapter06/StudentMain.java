package chapter06;

public class StudentMain {

	public static void main(String[] args) {
		//디폴트 생성자로 객체 생성
		Student student1=new Student();
		student1.studentName="최백설";
		student1.address="일산";
		student1.showStudentInfo();
		

		
		//생성자를 통해서 초기화 하여 showStudentInfo()로 출력
		Student student2=new Student("최백설", "일산동구");
		student2.showStudentInfo();
		
		Student student3=new Student();
		student3.setStudentName("최백설");
		student3.setAddress("일산");
		System.out.println(student3.getStudentName()+", "+student3.getAddress());
		student3.showStudentInfo();

	}

}
