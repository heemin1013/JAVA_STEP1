package chapter06;

public class StudentInfo {

	//�������(=�ʵ�)
	int studentID;
	private String studentName;
	int grade;
	String address;
	
	//������
	public StudentInfo() {
		
	}
	
	//������ �����ε�
	public StudentInfo(int studentID, String studentName, int grade, String address) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.grade = grade;
		this.address = address;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
	
	
	
}
