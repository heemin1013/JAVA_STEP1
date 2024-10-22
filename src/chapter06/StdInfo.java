package chapter06;

public class StdInfo {

	//¸â¹öº¯¼ö
	public String studentName;
	public int grade;
	public int money;
	
	public StdInfo(String studentName, int money) {
		this.studentName=studentName;
		this.money=money;
	}
	
	//¹ö½º
	public void takeBus(Bus bus) {
		bus.take(1400);
		this.money-=1400;
	}
	
	//ÁöÇÏÃ¶
	public void takeSubway(Subway subway) {
		subway.take(1800);
		this.money-=1800;
	}
	
	//ÀÜ¾×
	public void showInfo() {
		System.out.println(studentName+"´ÔÀÇ ³²Àº ÀÜ¾×: "+money+"¿ø ÀÔ´Ï´Ù");
	}
}
