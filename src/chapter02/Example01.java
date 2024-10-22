package chapter02;

public class Example01 {

	public static void main(String[] args) {
		// 534개의 책(books)을 학생(students) 30명에게 똑같은 갯수로 나눠줄 때,
		// 학생당 몇개씩 가지고, 최종적으로 몇개 남는지 구해보기

		int books = 534;
		int students = 30;
		int booksPerStudents = books / students;
		int booksLeft = books % students;

		System.out.println("갯수 : " + booksPerStudents);
		System.out.println("남는거 : " + booksLeft);

	}

}
