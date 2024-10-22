package chapter06;

public class TakeTrans {

	public static void main(String[] args) {
		
		StdInfo studentJames=new StdInfo("James", 15000);
		StdInfo studentTom=new StdInfo("Tom", 12000);
		
		//버스타기
		Bus bus100=new Bus(100);
		studentJames.takeBus(bus100);
		//James 정보보기
		studentJames.showInfo();
		bus100.showInfo();
		System.out.println("=======================");
		
		//버스타기(999)
		Bus bus999=new Bus(999);
		studentTom.takeBus(bus999);
		//Tom 정보보기
		studentTom.showInfo();
		bus999.showInfo();
		System.out.println();
		
		Subway sub1=new Subway("1호");
		studentJames.takeSubway(sub1);
		studentJames.showInfo();
		sub1.showInfo();
		System.out.println("==========================");
		
		Subway sub2=new Subway("2호");
		studentTom.takeSubway(sub2);
		studentTom.showInfo();
		sub2.showInfo();
	}

}
