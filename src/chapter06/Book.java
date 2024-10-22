package chapter06;

public class Book {

	//멤버변수
	public String bookname;
	public String author;
	
	public Book() {
		
	}
	
	public Book(String bookname, String author) {
		super();
		this.bookname = bookname;
		this.author = author;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showBookInfo() {
		System.out.println("책이름: "+bookname+" | 저자: "+author);
	}
	
}
