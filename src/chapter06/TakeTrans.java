package chapter06;

public class TakeTrans {

	public static void main(String[] args) {
		
		StdInfo studentJames=new StdInfo("James", 15000);
		StdInfo studentTom=new StdInfo("Tom", 12000);
		
		//����Ÿ��
		Bus bus100=new Bus(100);
		studentJames.takeBus(bus100);
		//James ��������
		studentJames.showInfo();
		bus100.showInfo();
		System.out.println("=======================");
		
		//����Ÿ��(999)
		Bus bus999=new Bus(999);
		studentTom.takeBus(bus999);
		//Tom ��������
		studentTom.showInfo();
		bus999.showInfo();
		System.out.println();
		
		Subway sub1=new Subway("1ȣ");
		studentJames.takeSubway(sub1);
		studentJames.showInfo();
		sub1.showInfo();
		System.out.println("==========================");
		
		Subway sub2=new Subway("2ȣ");
		studentTom.takeSubway(sub2);
		studentTom.showInfo();
		sub2.showInfo();
	}

}
