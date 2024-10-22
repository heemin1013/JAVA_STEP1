package chapter06;

public class StudentInfoMain {

	public static void main(String[] args) {
		//생성자 오버로딩을 이용한 멤버변수 초기화
		StudentInfo info=new StudentInfo(1004, "최백설", 1, "일산");
		System.out.println(info.address);
		
		//기본 생성자로 객체생성
		StudentInfo info1=new StudentInfo();
		//직관적인 초기화
		info1.address="종로구";
		System.out.println(info1.address);
		
		StudentInfo studentkim=new StudentInfo();
		//getters and setters
		studentkim.setStudentName("최재현");
		String sname=studentkim.getStudentName();
		System.out.println(sname);
	}

}
