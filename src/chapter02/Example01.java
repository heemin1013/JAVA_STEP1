package chapter02;

public class Example01 {

	public static void main(String[] args) {
		// 534���� å(books)�� �л�(students) 30���� �Ȱ��� ������ ������ ��,
		// �л��� ��� ������, ���������� � ������ ���غ���

		int books = 534;
		int students = 30;
		int booksPerStudents = books / students;
		int booksLeft = books % students;

		System.out.println("���� : " + booksPerStudents);
		System.out.println("���°� : " + booksLeft);

	}

}
